package com.simon.proyectomapasimon.datos

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Marcador::class, TipoMarcador::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun marcadorDao(): MarcadorDao
}
