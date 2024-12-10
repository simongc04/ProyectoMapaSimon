package com.simon.proyectomapasimon.datos

import androidx.room.*

@Entity(tableName = "marcadores")
data class Marcador(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val latitud: Double,
    val longitud: Double,
    val titulo: String
)