package com.goncalogarrido.maiuticastudents.repository

import androidx.room.Database
import androidx.room.RoomDatabase
import com.goncalogarrido.maiuticastudents.models.Tarefa

@Database(entities = [Tarefa::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tarefaDao(): TarefaDao
}
