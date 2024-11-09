import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import com.goncalogarrido.maiuticastudents.R
import com.goncalogarrido.maiuticastudents.viewmodels.AnunciosViewModel
import dev.jeziellago.compose.markdowntext.MarkdownText

@Composable
fun AnuncioDetailScreen(anuncioTitle: String, viewModel: AnunciosViewModel = viewModel(), onBackClick: () -> Unit) {
    val anuncio = viewModel.getAnuncioByTitle(anuncioTitle)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()) // Adiciona a rolagem à coluna inteira
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        ) {
            IconButton(onClick = onBackClick) {
                Icon(Icons.Default.ArrowBack, contentDescription = stringResource(R.string.voltar))
            }
            Text(
                text = anuncio?.titulo ?: stringResource(R.string.detalhes_do_anuncio),
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        anuncio?.let {
            // Exibe a imagem antes do Markdown
            Image(
                painter = rememberImagePainter(it.imagem),
                contentDescription = it.titulo,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 8.dp),
                contentScale = ContentScale.Crop
            )

            MarkdownText(
                markdown = it.conteudoMarkdown,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp), // Remove o peso para permitir que a coluna controle a rolagem
                style = TextStyle(
                    color = MaterialTheme.colorScheme.onBackground, // Cor clássica que adapta ao tema
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    textAlign = TextAlign.Justify,
                )
            )
        } ?: run {
            Text(
                text = "Anúncio não encontrado.",
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
