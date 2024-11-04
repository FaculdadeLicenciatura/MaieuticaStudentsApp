package com.goncalogarrido.maiuticastudents.viewmodels

import androidx.lifecycle.ViewModel
import com.goncalogarrido.maiuticastudents.models.Pergunta

class PerguntasViewModel : ViewModel() {
    val perguntas = listOf(
        Pergunta(
            "O que é o ISMAI?",
            "O ISMAI, Instituto Universitário da Maia, é uma instituição de ensino superior localizada na Maia, Porto. Oferece cursos de graduação, pós-graduação e mestrado em várias áreas de estudo."
        ),
        Pergunta(
            "O que é o IPMAIA?",
            "O IPMAIA, Instituto Politécnico da Maia, é uma instituição de ensino superior que também se localiza na Maia, Porto, e oferece cursos técnicos e licenciaturas em várias áreas."
        ),
        Pergunta(
            "Quais cursos são oferecidos no ISMAI?",
            "O ISMAI oferece cursos em áreas como Ciências do Desporto, Psicologia, Comunicação, Gestão, Direito, Engenharia Informática, entre outros."
        ),
        Pergunta(
            "Quais cursos são oferecidos no IPMAIA?",
            "O IPMAIA oferece cursos técnicos e licenciaturas em áreas como Informática, Design Gráfico, Marketing, Gestão, e Hotelaria."
        ),
        Pergunta(
            "Como é o ambiente de campus no ISMAI e IPMAIA?",
            "Ambas as instituições possuem um ambiente moderno com diversas instalações, incluindo bibliotecas, laboratórios, e áreas de lazer, proporcionando uma boa experiência universitária para os estudantes."
        ),
        Pergunta(
            "Quais são as opções de transporte para chegar ao ISMAI e IPMAIA?",
            "O ISMAI e o IPMAIA estão localizados próximos a estações de metro e paragens de autocarro, facilitando o acesso ao campus a partir de várias regiões do Porto e arredores."
        )
    )
}
