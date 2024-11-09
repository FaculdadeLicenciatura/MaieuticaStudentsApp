package com.goncalogarrido.maiuticastudents.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.goncalogarrido.maiuticastudents.viewmodels.PerguntasViewModel
import com.goncalogarrido.maiuticastudents.models.Pergunta

@Composable
fun PerguntasScreen(viewModel: PerguntasViewModel = viewModel()) {
    val perguntas: List<Pergunta> = viewModel.perguntas // Certifique-se que o tipo está correto
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(perguntas) { pergunta ->
            var expanded by remember { mutableStateOf(false) }
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable { expanded = !expanded }
                        .padding(16.dp)
                ) {
                    Text(text = pergunta.question, style = MaterialTheme.typography.titleMedium)
                    if (expanded) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = pergunta.answer, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}
