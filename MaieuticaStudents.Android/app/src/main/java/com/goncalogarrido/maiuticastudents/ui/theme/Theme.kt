package com.goncalogarrido.maiuticastudents.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Definição de cores para o tema escuro
private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF90CAF9), // Azul claro para destaque
    secondary = Color(0xFFBB86FC), // Roxo suave para elementos secundários
    tertiary = Color(0xFF80DEEA), // Ciano para elementos terciários
    background = Color(0xFF121212), // Fundo escuro
    surface = Color(0xFF1E1E1E), // Superfícies mais escuras
    onPrimary = Color.Black, // Texto em elementos primários
    onSecondary = Color.Black, // Texto em elementos secundários
    onTertiary = Color.Black, // Texto em elementos terciários
    onBackground = Color(0xFFE0E0E0), // Texto em fundo
    onSurface = Color(0xFFE0E0E0) // Texto em superfícies
)

private val LightColorScheme = lightColorScheme(
    primary = DarkTextIcon, // Cor principal para o tema claro
    secondary = HighlightButton, // Botões e elementos destacados
    tertiary = HighlightElements, // Elementos de destaque secundários
    background = BackgroundMain, // Fundo da aplicação
    surface = WhiteHighlight, // Superfícies de cartões e outros elementos
    onPrimary = Color.White, // Cor do texto nos elementos primários
    onSecondary = Color.White, // Cor do texto nos elementos secundários
    onTertiary = Color.White, // Cor do texto nos elementos terciários
    onBackground = DarkTextIcon, // Cor do texto no fundo
    onSurface = DarkTextIcon // Cor do texto em superfícies
)

@Composable
fun MaiêuticaStudentsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
