package com.goncalogarrido.maiuticastudents.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.goncalogarrido.maiuticastudents.models.Tarefa
import com.goncalogarrido.maiuticastudents.repository.TarefaRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TarefasViewModel(private val repository: TarefaRepository) : ViewModel() {
    private val _tarefas = MutableStateFlow<List<Tarefa>>(emptyList())
    val tarefas: StateFlow<List<Tarefa>> get() = _tarefas

    init {
        carregarTarefas()
    }

    private fun carregarTarefas() {
        viewModelScope.launch {
            _tarefas.value = repository.getAllTarefas()
        }
    }

    fun adicionarTarefa(tipo: String) {
        val novaTarefa = Tarefa(
            tipo = tipo,
            titulo = "Nova $tipo",
            descricao = "Descrição de exemplo",
            disciplina = "Disciplina de exemplo"
        )
        viewModelScope.launch {
            repository.insertTarefa(novaTarefa)
            carregarTarefas()
        }
    }
}
