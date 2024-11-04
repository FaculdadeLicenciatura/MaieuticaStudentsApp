package com.goncalogarrido.maiuticastudents.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.goncalogarrido.maiuticastudents.models.Anuncio
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AnunciosViewModel : ViewModel() {
    // Lista observável de anúncios
    private val _anuncios = MutableStateFlow<List<Anuncio>>(emptyList())
    val anuncios: StateFlow<List<Anuncio>> = _anuncios

    init {
        // Carregando dados de exemplo
        viewModelScope.launch {
            _anuncios.value = listOf(
                Anuncio(
                    "https://picsum.photos/400/200?random=1",
                    "Abertura do Ano Letivo",
                    "O ano letivo está começando! Prepare-se para novas experiências e aprendizado."
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=2",
                    "Evento de Boas-vindas",
                    "Participe do evento de boas-vindas para conhecer professores e colegas!"
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=3",
                    "Novos Cursos Disponíveis",
                    "Explore os novos cursos oferecidos pelo ISMAI e IPMAIA neste semestre."
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=4",
                    "Workshop de Carreiras",
                    "Aproveite o workshop de carreiras para melhorar suas oportunidades de emprego."
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=5",
                    "Biblioteca com Novo Horário",
                    "A biblioteca agora está aberta até as 22h. Aproveite para estudar com mais tranquilidade."
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=6",
                    "Inscrições para Estágios",
                    "As inscrições para estágios estão abertas. Garanta sua vaga agora mesmo!"
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=7",
                    "Semana da Saúde",
                    "Participe da Semana da Saúde com várias atividades físicas e palestras."
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=8",
                    "Feira de Tecnologia",
                    "Não perca a Feira de Tecnologia, com inovações e palestras sobre o futuro do mercado."
                )
            )
        }
    }
}
