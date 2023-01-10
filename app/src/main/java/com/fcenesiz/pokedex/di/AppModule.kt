package com.fcenesiz.pokedex.di

import com.fcenesiz.pokedex.data.remote.PokeApi
import com.fcenesiz.pokedex.repository.PokemonRepository
import com.fcenesiz.pokedex.repository.PokemonRepositoryImp
import com.fcenesiz.pokedex.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        api: PokeApi
    ) = PokemonRepositoryImp(api)

    @Singleton
    @Provides
    fun providePokemonApi() : PokeApi =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)

}