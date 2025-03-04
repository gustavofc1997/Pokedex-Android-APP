package com.gustavoforero.pokedexmovil.core.models

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gustavoforero.pokedexmovil.data.database.converters.StatsResponseConverter
import com.gustavoforero.pokedexmovil.data.database.converters.TypeResponseConverter
import com.gustavoforero.pokedexmovil.data.database.dao.PokemonDao
import com.gustavoforero.pokedexmovil.data.database.dao.PokemonInfoDao
import com.gustavoforero.pokedexmovil.data.database.entity.PokemonEntity
import com.gustavoforero.pokedexmovil.data.database.entity.PokemonInfoEntity

@Database(
  entities = [PokemonEntity::class, PokemonInfoEntity::class],
  version = 1,
  exportSchema = true,
)
@TypeConverters(value = [TypeResponseConverter::class, StatsResponseConverter::class])
abstract class PokedexDatabase : RoomDatabase() {

  abstract fun pokemonDao(): PokemonDao
  abstract fun pokemonInfoDao(): PokemonInfoDao
}
