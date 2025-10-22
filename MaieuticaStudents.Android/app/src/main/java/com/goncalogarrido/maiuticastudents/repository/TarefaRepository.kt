package com.goncalogarrido.maiuticastudents.repository

import com.goncalogarrido.maiuticastudents.models.Tarefa

class TarefaRepository(private val dao: TarefaDao) {
    suspend fun getAllTarefas(): List<Tarefa> = dao.getAllTarefas()
    suspend fun insertTarefa(tarefa: Tarefa) = dao.insertTarefa(tarefa)
}
