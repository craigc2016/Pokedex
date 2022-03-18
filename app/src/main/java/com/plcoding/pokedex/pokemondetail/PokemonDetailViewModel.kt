package com.plcoding.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.plcoding.pokedex.data.response.Pokemon
import com.plcoding.pokedex.repository.PokemonRepository
import com.plcoding.pokedex.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}