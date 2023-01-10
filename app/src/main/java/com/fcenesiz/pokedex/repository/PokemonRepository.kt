package com.fcenesiz.pokedex.repository

import androidx.compose.ui.geometry.Offset
import com.fcenesiz.pokedex.data.remote.PokeApi
import com.fcenesiz.pokedex.data.remote.responses.Pokemon
import com.fcenesiz.pokedex.data.remote.responses.PokemonList
import com.fcenesiz.pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
interface PokemonRepository{

    suspend fun getPokemonList(limit: Int, offset: Int) : Resource<PokemonList>

    suspend fun getPokemonInfo(pokemonName:String) : Resource<Pokemon>

}