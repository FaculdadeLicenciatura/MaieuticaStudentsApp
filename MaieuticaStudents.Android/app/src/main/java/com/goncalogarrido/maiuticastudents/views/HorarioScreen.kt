package com.goncalogarrido.maiuticastudents.views

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun HorarioScreen() {
    val username = "a038702"
    val password = "Donatello123."
    val url = "https://$username:$password@e-campus.ismai.pt"

    // Função JavaScript para verificar se PortalEdu está disponível e chamar showPopup
    val jsFunctionCall = """
    (function() {
        if (typeof PortalEdu !== 'undefined' && typeof PortalEdu.showPopup === 'function') {
            // Chama a função showPopup com os parâmetros exatos do botão
            PortalEdu.showPopup('/004358/Menu/Aluno/service.aspx?ListId={7A004958-1CDA-462B-B91C-90AC9125FF7E}&ID=5','Horário');
            return "Função showPopup chamada com sucesso.";
        } else {
            return "PortalEdu ou showPopup não estão disponíveis na página.";
        }
    })();
"""

    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.loadWithOverviewMode = true
                settings.useWideViewPort = true
                settings.builtInZoomControls = true
                settings.displayZoomControls = false // Remove os controles de zoom visuais, mas permite zoom por gestos
                setInitialScale(80) // Define um zoom inicial em 80% (ajuste conforme necessário)

                webViewClient = object : WebViewClient() {
                    override fun onPageFinished(view: WebView?, url: String?) {
                        Log.d("HorarioScreen", "Página carregada: $url")
                        // Aguarda 5 segundos para garantir que todos os scripts e elementos da página foram carregados
                        Handler(Looper.getMainLooper()).postDelayed({
                            view?.evaluateJavascript(jsFunctionCall) { result ->
                                // Exibe o resultado da verificação e chamada da função
                                Log.d("HorarioScreen", "Resultado da verificação e chamada da função JS: $result")
                                println("Resultado da verificação e chamada da função JS: $result")
                            }
                        }, 500) // Aguarda 5 segundos para o carregamento completo
                    }
                }

                webChromeClient = WebChromeClient()

                loadUrl(url) // URL com credenciais embutidas
            }
        },
        modifier = Modifier.fillMaxSize()
    )

}
