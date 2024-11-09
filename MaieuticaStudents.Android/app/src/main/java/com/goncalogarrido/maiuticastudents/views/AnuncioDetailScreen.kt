import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.goncalogarrido.maiuticastudents.viewmodels.AnunciosViewModel

@Composable
fun AnuncioDetailScreen(anuncioTitle: String, viewModel: AnunciosViewModel = viewModel()) {
    val anuncio = viewModel.getAnuncioByTitle(anuncioTitle)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        anuncio?.let {
            Text(
                text = it.titulo,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Exibindo o conteúdo do markdown diretamente em um Text
            Text(
                text = it.conteudoMarkdown,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.fillMaxWidth()
            )
        } ?: run {
            Text(
                text = "Anúncio não encontrado.",
                color = MaterialTheme.colorScheme.error
            )
        }
    }
}
