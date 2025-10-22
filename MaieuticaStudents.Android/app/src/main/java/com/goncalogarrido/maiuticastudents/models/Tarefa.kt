package com.goncalogarrido.maiuticastudents.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tarefa(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val tipo: String, // "frequencia", "trabalho" ou "apresentacao"
    val titulo: String,
    val descricao: String,
    val disciplina: String
)
