// src/main/java/com/goncalogarrido/maiuticastudents/views/EmailsScreen.kt
package com.goncalogarrido.maiuticastudents.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.goncalogarrido.maiuticastudents.viewmodels.EmailsViewModel

@Composable
fun EmailsScreen(viewModel: EmailsViewModel = viewModel()) {
    val emails = viewModel.emails
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(emails) { email ->
            Text(text = email)
        }
    }
}
