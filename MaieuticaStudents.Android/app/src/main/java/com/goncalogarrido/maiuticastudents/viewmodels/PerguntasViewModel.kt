package com.goncalogarrido.maiuticastudents.viewmodels

import androidx.lifecycle.ViewModel
import com.goncalogarrido.maiuticastudents.models.Pergunta

class PerguntasViewModel : ViewModel() {
    val perguntas = listOf(
        Pergunta(
            "O que é o ISMAI?",
            "O ISMAI, Instituto Universitário da Maia, é uma instituição de ensino superior localizada na Maia, Porto. Oferece uma variedade de cursos de graduação, pós-graduação e mestrado em áreas como Ciências do Desporto, Psicologia, Direito, Gestão, Engenharia e Comunicação. O ISMAI é conhecido pela sua forte tradição acadêmica e pelo compromisso com a excelência no ensino e na investigação."
        ),
        Pergunta(
            "O que é o IPMAIA?",
            "O IPMAIA, Instituto Politécnico da Maia, é uma instituição de ensino superior localizada na mesma região que o ISMAI. O IPMAIA oferece uma abordagem mais prática e profissionalizante, com cursos técnicos superiores e licenciaturas em áreas como Informática, Gestão, Design Gráfico, Marketing e Hotelaria. A instituição visa preparar os alunos para o mercado de trabalho com uma educação orientada para a prática."
        ),
        Pergunta(
            "O que é a UMAIA?",
            "A UMAIA, Universidade da Maia, é uma entidade que combina as melhores práticas do ISMAI e IPMAIA, visando proporcionar uma educação de alta qualidade e integrada. A UMAIA foca-se em oferecer uma formação abrangente que cobre diversas áreas do conhecimento, preparando os alunos para desafios globais."
        ),
        Pergunta(
            "Quais cursos são oferecidos no ISMAI?",
            "O ISMAI oferece cursos em diversas áreas, incluindo:\n- Ciências do Desporto (Licenciaturas e Mestrados)\n- Psicologia (Licenciatura, Mestrado e Doutoramento)\n- Direito (Licenciatura e Mestrado)\n- Engenharia Informática (Licenciatura)\n- Gestão e Administração (Licenciatura e Pós-Graduação)\n- Comunicação e Relações Públicas\n- Criminologia\nOs programas são estruturados para fornecer uma base teórica sólida e uma aplicação prática eficaz."
        ),
        Pergunta(
            "Quais cursos são oferecidos no IPMAIA?",
            "O IPMAIA oferece uma série de cursos de curta e longa duração, como:\n- Informática (Licenciatura e Cursos Técnicos Superiores Profissionais - CTeSP)\n- Design Gráfico e Multimédia\n- Marketing e Publicidade\n- Gestão e Contabilidade\n- Hotelaria e Turismo\n- Animação Sociocultural e Desportiva\nEstes cursos são voltados para proporcionar habilidades práticas e conhecimentos específicos que permitem uma rápida inserção no mercado de trabalho."
        ),
        Pergunta(
            "Como é o ambiente de campus no ISMAI e IPMAIA?",
            "O ambiente de campus nas duas instituições é acolhedor e moderno, com diversas infraestruturas como:\n- Bibliotecas bem equipadas\n- Laboratórios de última geração\n- Salas de estudo e áreas comuns\n- Instalações desportivas de alta qualidade\n- Cafeterias e áreas de convívio\nEsses espaços criam um ambiente propício para o estudo e socialização dos alunos, promovendo uma experiência universitária rica e envolvente."
        ),
        Pergunta(
            "Quais são as opções de transporte para chegar ao ISMAI e IPMAIA?",
            "O ISMAI e o IPMAIA estão convenientemente localizados próximos a várias opções de transporte público. O campus tem acesso direto à estação de metro ISMAI (linha C), que conecta a Maia com o centro do Porto e outras áreas adjacentes. Além disso, existem várias paragens de autocarro nas proximidades, garantindo fácil acesso para quem vem de outras cidades da região."
        ),
        Pergunta(
            "Quais são os contactos e informações importantes da UMAIA?",
            "Para entrar em contacto com a UMAIA, você pode utilizar as seguintes informações:\n- Endereço: Avenida Carlos de Oliveira Campos - Castêlo da Maia / 4475-690 Maia\n- Telefone: (+351) 229 866 000\n- Linha Azul: (+351) 808 202 214\n- Email: info@umaia.pt\nEsses contactos são essenciais para estudantes que desejam obter mais informações sobre cursos, inscrições, e outros assuntos acadêmicos."
        ),
        Pergunta(
            "Que apoio estudantil está disponível no ISMAI e IPMAIA?",
            "As instituições oferecem uma ampla gama de apoios estudantis, incluindo:\n- Serviços de aconselhamento psicológico\n- Apoio académico, como tutoria e mentorias\n- Bolsas de estudo e apoio financeiro para alunos com necessidades económicas\n- Programas de integração para novos alunos\nEsses serviços são projetados para garantir que todos os alunos tenham suporte adequado para ter sucesso em sua jornada acadêmica."
        ),
        Pergunta(
            "Que eventos e atividades extracurriculares são realizados no ISMAI e IPMAIA?",
            "Ambas as instituições promovem uma série de eventos e atividades, incluindo:\n- Palestras e seminários com profissionais de destaque\n- Workshops de desenvolvimento de habilidades práticas\n- Competições desportivas e torneios\n- Festas e eventos culturais\nEssas atividades oferecem aos alunos a oportunidade de expandir sua rede de contactos, desenvolver habilidades adicionais e aproveitar a vida universitária."
        ),
        Pergunta(
            "Quais são as vantagens de estudar no ISMAI e IPMAIA?",
            "Estudar no ISMAI e IPMAIA oferece várias vantagens, como:\n- Excelentes instalações acadêmicas e desportivas\n- Corpo docente qualificado e experiente\n- Forte conexão com o mercado de trabalho, facilitando estágios e inserção profissional\n- Ambiente multicultural que promove o intercâmbio de ideias\nEsses fatores contribuem para uma formação completa e de alta qualidade."
        )
    )
}
