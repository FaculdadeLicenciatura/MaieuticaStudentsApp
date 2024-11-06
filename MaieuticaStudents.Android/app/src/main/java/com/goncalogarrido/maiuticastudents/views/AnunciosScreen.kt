package com.goncalogarrido.maiuticastudents.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.goncalogarrido.maiuticastudents.models.Anuncio
import com.goncalogarrido.maiuticastudents.viewmodels.AnunciosViewModel

@Composable
fun AnunciosScreen(viewModel: AnunciosViewModel = viewModel(), navController: NavController) {
    val anuncios = viewModel.anuncios.collectAsState().value

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(anuncios) { anuncio ->
            AnuncioItem(anuncio = anuncio, onClick = {
                navController.navigate("anuncio_detail/${anuncio.titulo}")
            })
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun AnuncioItem(anuncio: Anuncio, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = rememberImagePainter(anuncio.imagem),
                contentDescription = anuncio.titulo,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = anuncio.titulo, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = anuncio.descricao, style = MaterialTheme.typography.bodyMedium)
        }
    }
}
