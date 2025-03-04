package com.gustavoforero.pokedexmovil.data.database
@Dao
interface PokemonDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun insertPokemonList(pokemonList: List<PokemonEntity>)

  @Query("SELECT * FROM PokemonEntity WHERE page = :page_")
  suspend fun getPokemonList(page_: Int): List<PokemonEntity>

  @Query("SELECT * FROM PokemonEntity WHERE page <= :page_")
  suspend fun getAllPokemonList(page_: Int): List<PokemonEntity>
}
