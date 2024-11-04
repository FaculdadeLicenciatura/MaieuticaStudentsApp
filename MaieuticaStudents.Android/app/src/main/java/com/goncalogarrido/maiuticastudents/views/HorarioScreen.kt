package com.goncalogarrido.maiuticastudents.views

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun HorarioScreen() {
    AndroidView(
        factory = { context ->
            WebView(context).apply {
                webViewClient = WebViewClient() // Mantém a navegação dentro da WebView
                loadUrl("https://image.slidesharecdn.com/horriopessoal-141006160647-conversion-gate01/75/Horario-pessoal-1-2048.jpg")
                settings.javaScriptEnabled = true // Habilita JavaScript se necessário
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}
