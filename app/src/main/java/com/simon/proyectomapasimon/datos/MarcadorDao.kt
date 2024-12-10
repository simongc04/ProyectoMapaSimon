package com.simon.proyectomapasimon.datos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MarcadorDao {
    @Query("SELECT * FROM marcadores")
    fun getAllMarcadores(): List<Marcador>

    @Query("SELECT * FROM tipo_marcadores")
    fun getAllTipos(): List<TipoMarcador>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMarcador(marcador: Marcador)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTipoMarcador(tipo: TipoMarcador)
}
