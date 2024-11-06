import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import org.commonmark.parser.Parser
import org.commonmark.renderer.html.HtmlRenderer
import android.webkit.WebView
import android.webkit.WebViewClient
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

            // Converte Markdown para HTML
            val parser = Parser.builder().build()
            val document = parser.parse(it.conteudoMarkdown)
            val renderer = HtmlRenderer.builder().build()
            val htmlContent = renderer.render(document)

            // Exibindo o HTML convertido em um WebView
            AndroidView(
                factory = { context ->
                    WebView(context).apply {
                        webViewClient = WebViewClient()
                        loadDataWithBaseURL(null, htmlContent, "text/html", "UTF-8", null)
                    }
                },
                modifier = Modifier.fillMaxSize()
            )
        } ?: run {
            Text(
                text = "Anúncio não encontrado.",
                color = MaterialTheme.colorScheme.error
            )
        }
    }
}
