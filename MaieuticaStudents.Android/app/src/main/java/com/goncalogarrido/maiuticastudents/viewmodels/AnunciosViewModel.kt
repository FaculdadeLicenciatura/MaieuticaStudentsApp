package com.goncalogarrido.maiuticastudents.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.goncalogarrido.maiuticastudents.models.Anuncio
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import androidx.lifecycle.viewmodel.compose.viewModel


class AnunciosViewModel : ViewModel() {
    private val _anuncios = MutableStateFlow<List<Anuncio>>(emptyList())
    val anuncios: StateFlow<List<Anuncio>> = _anuncios

    init {
        viewModelScope.launch {
            _anuncios.value = listOf(
                Anuncio(
                    "https://picsum.photos/400/200?random=1",
                    "Abertura do Ano Letivo",
                    "O ano letivo está começando! Prepare-se para novas experiências e aprendizado.",
                    conteudoMarkdown = """
                        # Abertura do Ano Letivo
                        Bem-vindo ao início de mais um ano letivo! Estamos animados em recebê-lo.
                        
                        ## Programação
                        - Boas-vindas aos novos alunos
                        - Orientação para o ano letivo
                        - Palestras com professores e convidados
                        
                        Aproveite para conhecer seus colegas e aprender mais sobre o que o futuro reserva!
                    """
                ),
                // Adicione outros anúncios conforme necessário...
            )
        }
    }

    fun getAnuncioByTitle(title: String): Anuncio? {
        return _anuncios.value.find { it.titulo == title }
    }

}
