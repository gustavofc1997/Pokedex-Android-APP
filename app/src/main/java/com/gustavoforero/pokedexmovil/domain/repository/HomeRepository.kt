package com.gustavoforero.pokedexmovil.data.repository

import androidx.annotation.WorkerThread
import com.gustavoforero.pokedexmovil.core.models.Pokemon
import kotlinx.coroutines.flow.Flow

interface HomeRepository {

  @WorkerThread
  fun fetchPokemonList(
    page: Int,
    onStart: () -> Unit,
    onComplete: () -> Unit,
    onError: (String?) -> Unit,
  ): Flow<List<Pokemon>>
}
