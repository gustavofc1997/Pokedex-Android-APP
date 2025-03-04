package com.gustavoforero.pokedexmovil.network.service

import com.gustavoforero.pokedexmovil.domain.model.PokemonInfo
import com.gustavoforero.pokedexmovil.data.models.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokedexService {

    @GET("pokemon")
    suspend fun fetchPokemonList(
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0,
    ): PokemonResponse

    @GET("pokemon/{name}")
    suspend fun fetchPokemonInfo(@Path("name") name: String): PokemonInfo
}
