package com.goncalogarrido.maiuticastudents.viewmodels

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

class EmailsViewModel : ViewModel() {
    // Lista de e-mails de exemplo para exibir na tela
    val emails: SnapshotStateList<String> = mutableStateListOf(
        "coordenacao@ismai.pt",
        "info@ipmaia.pt",
        "suporte@ismai.pt",
        "biblioteca@ipmaia.pt",
        "alunos@ismai.pt",
        "financeiro@ipmaia.pt",
        "eventos@ismai.pt",
        "carreiras@ipmaia.pt",
        "estagios@ismai.pt",
        "administracao@ismai.pt",
        "secretaria@ipmaia.pt",
        "ouvidoria@ismai.pt",
        "comunicacao@ipmaia.pt",
        "saude@ismai.pt",
        "tecnologia@ipmaia.pt"
    )
}
