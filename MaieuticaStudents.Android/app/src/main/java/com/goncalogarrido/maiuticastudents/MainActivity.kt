package com.goncalogarrido.maiuticastudents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.goncalogarrido.maiuticastudents.ui.theme.MaiêuticaStudentsTheme
import com.goncalogarrido.maiuticastudents.views.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaiêuticaStudentsTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "principal",
            modifier = androidx.compose.ui.Modifier.padding(paddingValues)
        ) {
            composable("horario") { HorarioScreen() }
            composable("anuncios") { AnunciosScreen() }
            composable("principal") { PrincipalScreen() }
            composable("perguntas") { PerguntasScreen() }
            composable("emails") { EmailsScreen() }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: androidx.navigation.NavController) {
    val items = listOf("horario", "anuncios", "principal", "perguntas", "emails")
    val titles = listOf("Horário", "Anúncios", "Principal", "Perguntas", "E-mails")
    val icons = listOf(
        Icons.Default.Star,         // Horário
        Icons.Default.Info,          // Anúncios
        Icons.Default.Home,          // Principal
        Icons.Default.Person,        // Perguntas
        Icons.Default.Email          // E-mails
    )

    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(icons[index], contentDescription = titles[index]) },
                label = { Text(titles[index]) },
                selected = currentRoute == item,
                onClick = {
                    navController.navigate(item) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
