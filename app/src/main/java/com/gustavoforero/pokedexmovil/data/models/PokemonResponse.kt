package com.gustavoforero.pokedexmovil.network.model

import com.gustavoforero.pokedexmovil.core.models.Pokemon
import kotlinx.serialization.Serializable

@Serializable
data class PokemonResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>,
)
