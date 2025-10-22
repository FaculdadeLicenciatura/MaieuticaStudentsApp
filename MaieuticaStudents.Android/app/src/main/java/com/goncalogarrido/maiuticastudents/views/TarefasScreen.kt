package com.goncalogarrido.maiuticastudents.views

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Addchart
import androidx.compose.material.icons.filled.Checklist
import androidx.compose.material.icons.filled.Work
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.goncalogarrido.maiuticastudents.models.Tarefa
import com.goncalogarrido.maiuticastudents.viewmodels.TarefasViewModel

@Composable
fun TarefasScreen(viewModel: TarefasViewModel = viewModel()) {
    var expanded by remember { mutableStateOf(false) }
    val tarefas = viewModel.tarefas.collectAsState().value

    Scaffold(
        floatingActionButton = {
            Box(modifier = Modifier.padding(16.dp)) {
                Column(horizontalAlignment = Alignment.End) {
                    // Botões adicionais
                    AnimatedVisibility(
                        visible = expanded,
                        enter = expandVertically(),
                        exit = shrinkVertically()
                    ) {
                        Column {
                            FloatingActionButton(
                                onClick = { viewModel.adicionarTarefa("frequencia") },
                                modifier = Modifier.padding(bottom = 8.dp),
                                containerColor = MaterialTheme.colorScheme.primary
                            ) {
                                Icon(imageVector = Icons.Default.Checklist, contentDescription = "Adicionar Frequência")
                            }
                            FloatingActionButton(
                                onClick = { viewModel.adicionarTarefa("trabalho") },
                                modifier = Modifier.padding(bottom = 8.dp),
                                containerColor = MaterialTheme.colorScheme.secondary
                            ) {
                                Icon(imageVector = Icons.Default.Work, contentDescription = "Adicionar Trabalho")
                            }
                            FloatingActionButton(
                                onClick = { viewModel.adicionarTarefa("apresentacao") },
                                modifier = Modifier.padding(bottom = 8.dp),
                                containerColor = MaterialTheme.colorScheme.tertiary
                            ) {
                                Icon(imageVector = Icons.Default.Addchart, contentDescription = "Adicionar Apresentação")
                            }
                        }
                    }
                    // Botão principal
                    FloatingActionButton(
                        onClick = { expanded = !expanded },
                        containerColor = MaterialTheme.colorScheme.primary
                    ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "Adicionar")
                    }
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding,
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(tarefas) { tarefa ->
                TarefaItem(tarefa = tarefa)
            }
        }
    }
}

@Composable
fun TarefaItem(tarefa: Tarefa) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = tarefa.tipo.uppercase(), style = MaterialTheme.typography.labelLarge)
            Text(text = tarefa.titulo, style = MaterialTheme.typography.titleMedium)
            Text(text = tarefa.descricao, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
