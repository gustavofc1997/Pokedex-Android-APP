package com.gustavoforero.pokedexmovil.data.repository

import androidx.annotation.WorkerThread
import com.gustavoforero.pokedexmovil.core.models.PokemonInfo
import kotlinx.coroutines.flow.Flow

interface DetailsRepository {
    @WorkerThread
    fun fetchPokemonInfo(
        name: String,
        onComplete: () -> Unit,
        onError: (String?) -> Unit,
    ): Flow<PokemonInfo>

}