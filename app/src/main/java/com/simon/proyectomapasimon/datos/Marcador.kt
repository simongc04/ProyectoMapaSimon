package com.simon.proyectomapasimon.datos

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "marcadores",
    foreignKeys = [ForeignKey(
        entity = TipoMarcador::class,
        parentColumns = ["id"],
        childColumns = ["tipoId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index("tipoId")]
)
data class Marcador(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val latitud: Double,
    val longitud: Double,
    val titulo: String,
    val tipoId: Int
)
