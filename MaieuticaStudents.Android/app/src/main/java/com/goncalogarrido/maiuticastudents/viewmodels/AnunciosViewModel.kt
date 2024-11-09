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
Bem-vindo ao início de mais um ano letivo! Estamos empolgados em recebê-lo de volta ao nosso campus, um espaço de aprendizado, inovação e crescimento. Este é o momento perfeito para renovar sua motivação, traçar novas metas e preparar-se para mais um capítulo de desenvolvimento acadêmico e pessoal.

## Programação do Evento de Boas-vindas
A programação da abertura do ano letivo foi cuidadosamente planejada para garantir que você tenha todas as ferramentas e informações necessárias para começar com o pé direito. Confira o que preparamos para você:

### 1. Boas-vindas aos Novos Alunos
- **Discurso de Abertura**: Uma mensagem inspiradora da direção da universidade, destacando a importância da jornada acadêmica e os valores que cultivamos.
- **Apresentação das Instalações**: Um tour detalhado pelo campus, para que você possa se familiarizar com todas as áreas e serviços disponíveis, incluindo laboratórios, biblioteca, áreas de lazer e muito mais.
- **Entrega de Kits de Boas-vindas**: Materiais acadêmicos essenciais e itens personalizados para facilitar sua adaptação.

### 2. Orientação para o Ano Letivo
- **Sessão de Informações Acadêmicas**: Explicação sobre o calendário acadêmico, datas importantes, prazos e procedimentos para matrículas, exames e submissão de trabalhos.
- **Workshops de Preparação**: Sessões práticas sobre técnicas de estudo eficazes, gerenciamento de tempo e dicas para equilibrar vida acadêmica e pessoal.
- **Apresentação de Plataformas Virtuais**: Demonstrações de uso de sistemas essenciais, como a plataforma de e-learning, ferramentas de suporte ao estudante e aplicativos para acesso a recursos da universidade.

### 3. Palestras com Professores e Convidados
- **Mesa Redonda com Professores**: Discussões interativas sobre as expectativas para o novo semestre, dicas de sucesso acadêmico e oportunidades de aprendizado além da sala de aula.
- **Palestras de Convidados Especiais**: Especialistas de diferentes áreas compartilharão suas experiências e conhecimentos, motivando os alunos a perseguir seus objetivos com determinação e foco.
- **Sessão de Perguntas e Respostas**: Uma oportunidade para você interagir diretamente com palestrantes e professores, tirar dúvidas e obter conselhos sobre sua trajetória acadêmica.

## Oportunidades de Integração e Networking
Além das atividades formais, a abertura do ano letivo é uma excelente ocasião para fazer novos amigos e ampliar sua rede de contatos. Participe de atividades recreativas e momentos de descontração, como:
- **Coffee Break de Integração**: Encontre-se com colegas e professores em um ambiente descontraído para iniciar conexões que podem durar a vida inteira.
- **Jogos Interativos**: Atividades em grupo para promover o trabalho em equipe e a cooperação entre os alunos de diferentes cursos e turmas.
- **Sessão de Fotos**: Imortalize este momento especial com fotos em espaços decorados e prepare-se para começar o ano com boas lembranças.

## Recursos e Suporte ao Estudante
Estamos comprometidos em oferecer todo o apoio necessário para que você tenha um ano acadêmico bem-sucedido. Confira os recursos à sua disposição:
- **Apoio Acadêmico e Tutoria**: Sessões de tutoria e ajuda acadêmica para reforçar conteúdos e tirar dúvidas.
- **Serviços de Bem-estar e Saúde**: Acesso a programas de apoio psicológico e serviços de saúde, garantindo que você cuide tanto do corpo quanto da mente.
- **Biblioteca com Acervo Atualizado**: Novos livros, artigos científicos e acesso a bases de dados internacionais para pesquisas aprofundadas.
- **Laboratórios Modernos**: Equipamentos de ponta e tecnologias atualizadas para enriquecer seu aprendizado prático.

## Dicas para Aproveitar ao Máximo a Experiência Acadêmica
- **Participe das Atividades**: Seja ativo nos eventos e sessões, isso ajudará você a se ambientar e a se envolver mais no seu curso.
- **Seja Proativo**: Faça perguntas, compartilhe suas ideias e aproveite a oportunidade de estar rodeado por professores e profissionais qualificados.
- **Cuide de Você Mesmo**: Encontre tempo para descanso e lazer. O equilíbrio é a chave para um desempenho acadêmico saudável e sustentável.

Esperamos que este seja o início de um ano letivo repleto de conquistas, aprendizado e muitas experiências positivas. Estamos felizes em tê-lo conosco nesta jornada e desejamos a você um excelente começo de semestre!

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
