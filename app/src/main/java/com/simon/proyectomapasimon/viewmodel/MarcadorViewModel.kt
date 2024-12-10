package com.simon.proyectomapasimon.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.Room
import com.simon.proyectomapasimon.datos.AppDatabase
import com.simon.proyectomapasimon.datos.Marcador
import com.simon.proyectomapasimon.datos.TipoMarcador
import kotlinx.coroutines.launch

class MarcadorViewModel(application: Application) : AndroidViewModel(application) {
    private val db = Room.databaseBuilder(
        application,
        AppDatabase::class.java, "marcadores-db"
    ).build()

    val marcadores = db.marcadorDao().getAllMarcadores()
    val tipos = db.marcadorDao().getAllTipos()

    fun agregarMarcador(marcador: Marcador) {
        viewModelScope.launch {
            db.marcadorDao().insertMarcador(marcador)
        }
    }

    fun agregarTipoMarcador(tipo: TipoMarcador) {
        viewModelScope.launch {
            db.marcadorDao().insertTipoMarcador(tipo)
        }
    }
}
