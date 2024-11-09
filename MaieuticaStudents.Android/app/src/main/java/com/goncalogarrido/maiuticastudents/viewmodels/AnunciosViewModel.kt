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
<<<<<<< Updated upstream
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
=======
                    "Semana da Saúde e Bem-Estar",
                    "Participe da Semana da Saúde e aprenda mais sobre como manter uma vida saudável durante os estudos.",
                    conteudoMarkdown = """
# Semana da Saúde e Bem-Estar
Durante esta semana especial, convidamos todos os alunos a participar de atividades focadas na saúde física e mental. Nossa programação inclui:

## Atividades Programadas
- **Palestras sobre Saúde Mental**: Psicólogos convidados irão discutir técnicas para lidar com o estresse e a ansiedade.
- **Aulas de Yoga e Meditação**: Momentos de relaxamento guiados para melhorar a concentração e o bem-estar geral.
- **Oficinas de Alimentação Saudável**: Nutricionistas ensinarão receitas práticas e nutritivas que podem ser preparadas com facilidade.

## Por que participar?
Cuidar da saúde mental e física é essencial para manter um bom desempenho acadêmico. Participar dessas atividades pode ajudá-lo a desenvolver hábitos saudáveis e a manter uma rotina equilibrada.
"""
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=3",
                    "Workshop de Desenvolvimento de Carreira",
                    "Melhore suas habilidades profissionais com o nosso workshop de desenvolvimento de carreira.",
                    conteudoMarkdown = """
# Workshop de Desenvolvimento de Carreira
Este workshop foi criado para ajudá-lo a se preparar para o mercado de trabalho e para o desenvolvimento da sua carreira. 

## O que você aprenderá?
- **Elaboração de Currículo**: Dicas práticas para criar um currículo que se destaque.
- **Simulações de Entrevistas**: Treine para entrevistas de emprego com feedback especializado.
- **Redes de Contatos**: Como usar o networking a seu favor para conseguir oportunidades de estágio e emprego.

## Palestrantes
Especialistas de empresas renomadas estarão presentes para compartilhar suas experiências e responder a perguntas.
"""
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=4",
                    "Feira de Inovação Tecnológica",
                    "Conheça as inovações tecnológicas mais recentes na nossa feira anual.",
                    conteudoMarkdown = """
# Feira de Inovação Tecnológica
Nossa feira anual de tecnologia é uma vitrine para inovações e projetos criados por alunos e parceiros da indústria.

## Destaques da Feira
- **Demonstrações de Projetos**: Veja projetos desenvolvidos pelos alunos nas áreas de robótica, software e eletrônica.
- **Palestras de Especialistas**: Profissionais da indústria de tecnologia discutirão as tendências e o futuro da área.
- **Sessões de Networking**: Oportunidade de conhecer empresas em busca de novos talentos e parcerias.

## Participe e inspire-se!
A feira é uma chance única de se conectar com outros apaixonados por tecnologia e explorar novas possibilidades de carreira.
"""
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=5",
                    "Biblioteca 24 Horas na Época de Exames",
                    "A biblioteca estará aberta 24 horas para apoiar os alunos durante o período de exames.",
                    conteudoMarkdown = """
# Biblioteca 24 Horas na Época de Exames
Compreendemos a importância de ter um espaço para estudar com tranquilidade, especialmente durante os exames. Por isso, a biblioteca do campus estará aberta 24 horas por dia.

## Serviços Oferecidos
- **Salas de Estudo em Grupo**: Reserve uma sala para trabalhar em projetos e revisar matérias com colegas.
- **Acesso a Recursos Digitais**: Utilize computadores com acesso a bases de dados e softwares específicos para estudos.
- **Café e Lanches**: Área de convivência com café disponível para manter a energia durante a madrugada.

## Dicas de Estudo
- Faça pausas regulares para evitar a fadiga.
- Traga seus materiais de estudo e aproveite o ambiente silencioso para focar.
"""
                ),
                Anuncio(
                    "https://picsum.photos/400/200?random=6",
                    "Palestra: Futuro do Trabalho e Novas Competências",
                    "Descubra como as novas tecnologias estão moldando o futuro do mercado de trabalho.",
                    conteudoMarkdown = """
# Palestra: Futuro do Trabalho e Novas Competências
Junte-se a nós para uma palestra inspiradora sobre as tendências do mercado de trabalho e as habilidades que serão mais valorizadas nos próximos anos.

## Tópicos Abordados
- **Impacto da Automação**: Como a inteligência artificial e a automação estão transformando profissões.
- **Competências do Futuro**: Soft skills e hard skills que farão a diferença na sua carreira.
- **Adaptação e Resiliência**: Estratégias para se manter relevante em um mundo em constante mudança.

## Convidados Especiais
Contaremos com a presença de líderes de grandes empresas para compartilhar insights sobre suas expectativas para os profissionais do futuro.
"""
>>>>>>> Stashed changes
                )
            )
        }
    }
}
