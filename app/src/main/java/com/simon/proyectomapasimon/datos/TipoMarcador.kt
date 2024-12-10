package com.simon.proyectomapasimon.datos

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tipo_marcadores")
data class TipoMarcador(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String
)
