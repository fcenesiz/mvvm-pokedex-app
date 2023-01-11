package com.fcenesiz.pokedex.ui.pokemondetail

import androidx.lifecycle.ViewModel
import com.fcenesiz.pokedex.data.remote.responses.Pokemon
import com.fcenesiz.pokedex.repository.PokemonRepositoryImp
import com.fcenesiz.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepositoryImp
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }

}