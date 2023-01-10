package com.fcenesiz.pokedex.repository

import com.fcenesiz.pokedex.data.remote.PokeApi
import com.fcenesiz.pokedex.data.remote.responses.Pokemon
import com.fcenesiz.pokedex.data.remote.responses.PokemonList
import com.fcenesiz.pokedex.util.Resource
import javax.inject.Inject

class PokemonRepositoryImp @Inject constructor(
    private val api: PokeApi
) : PokemonRepository {

    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        }catch (e: Exception){
            return Resource.Error("An unknown error occurred.")
        }
        return Resource.Success(response)
    }

    override suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        }catch (e: Exception){
            return Resource.Error("An unknown error occurred.")
        }
        return Resource.Success(response)
    }
}