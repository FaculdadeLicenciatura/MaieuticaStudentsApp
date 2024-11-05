package com.goncalogarrido.maiuticastudents.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person

@Composable
fun PrincipalScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Boas-vindas
        item {
            Text(
                text = "Bem-vindo de volta, Gonçalo!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        // Ações principais
        item {
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "O que você gostaria de fazer hoje?", fontSize = 18.sp)
            Spacer(modifier = Modifier.height(16.dp))
        }

        item { ActionButton(text = "Ver Horário", icon = Icons.Default.Star) }
        item { ActionButton(text = "Ver Anúncios", icon = Icons.Default.Info) }
        item { ActionButton(text = "Contactar Secretariado", icon = Icons.Default.Email) }

        item { Spacer(modifier = Modifier.height(24.dp)) }

        // Seção de Números e Factos
        item {
            Text(
                text = "Números e Factos",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        item { NumberFactRow(number = "+30", description = "Anos de experiência no ensino") }
        item { NumberFactRow(number = "+25000", description = "Estudantes formados") }
        item { NumberFactRow(number = "+10000", description = "Bolsas de estudo atribuídas desde 2010") }

        item { Spacer(modifier = Modifier.height(24.dp)) }

        // Informações de contato
        item {
            Text(
                text = "Informações de Contato",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }

        item { ContactInfo(text = "Universidade da Maia", detail = "Avenida Carlos de Oliveira Campos - Castêlo da Maia / 4475-690 Maia") }
        item { ContactInfo(text = "Telefone", detail = "(+351) 229 866 000", icon = Icons.Default.Phone) }
        item { ContactInfo(text = "Linha Azul", detail = "(+351) 808 202 214", icon = Icons.Default.Phone) }
        item { ContactInfo(text = "Email", detail = "info@umaia.pt", icon = Icons.Default.Email) }
    }
}

@Composable
fun ActionButton(text: String, icon: androidx.compose.ui.graphics.vector.ImageVector) {
    Button(
        onClick = { /* Ação a ser executada */ },
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Icon(icon, contentDescription = text, modifier = Modifier.size(24.dp))
        Spacer(modifier = Modifier.width(8.dp))
        Text(text)
    }
}

@Composable
fun NumberFactRow(number: String, description: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Text(
            text = number,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .width(80.dp)
                .padding(end = 5.dp) // Margem direita de 5dp
        )
        Text(
            text = description,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ContactInfo(text: String, detail: String, icon: androidx.compose.ui.graphics.vector.ImageVector? = null) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        icon?.let {
            Icon(icon, contentDescription = text, modifier = Modifier.size(24.dp).padding(end = 8.dp))
        }
        Column {
            Text(text = text, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(text = detail, fontSize = 14.sp, color = Color.Gray)
        }
    }
}
