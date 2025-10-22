package com.goncalogarrido.maiuticastudents.repository

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.goncalogarrido.maiuticastudents.models.Tarefa

@Dao
interface TarefaDao {
    @Query("SELECT * FROM Tarefa")
    suspend fun getAllTarefas(): List<Tarefa>

    @Insert
    suspend fun insertTarefa(tarefa: Tarefa)
}
