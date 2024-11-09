# Maiêutica Students App

Bem-vindo à **Maiêutica Students App**, uma aplicação móvel projetada para melhorar a experiência académica dos alunos do ISMAI e IPMAIA. Este projeto, desenvolvido com **Jetpack Compose** e **Kotlin**, tem como objetivo fornecer informações, notícias e recursos úteis num ambiente intuitivo e moderno.

## Funcionalidades
- **Splash Screen Animada**: Apresenta uma tela de abertura com uma animação de fade-in, exibindo o nome do desenvolvedor.
- **Navegação Intuitiva**: Utilização da navegação do Jetpack para uma experiência de utilizador fluída entre as diferentes secções da aplicação.
- **Anúncios Detalhados**: Exibição de anúncios com suporte a Markdown para apresentar conteúdo formatado.
- **Perguntas e Respostas**: Secção dedicada a perguntas frequentes sobre o ISMAI e IPMAIA.
- **Visualização de E-mails e Informações de Contacto**: Acesso fácil aos e-mails importantes e informações de contacto das instituições.
- **Temas Personalizados**: Suporte a temas claros e escuros, incluindo cores personalizadas que refletem a identidade visual do campus.

## Capturas de Ecrã
*Adicione aqui imagens da aplicação mostrando diferentes secções, como a splash screen, listagem de anúncios, detalhes dos anúncios, etc.*

## Tecnologias Utilizadas
- **Kotlin**: Linguagem principal do projeto.
- **Jetpack Compose**: Framework de UI moderno e declarativo.
- **Coroutines**: Para gestão assíncrona e tarefas em background.
- **Material3**: Sistema de design para estilização de componentes.
- **Coil**: Para carregamento de imagens.

## Estrutura do Projeto
O projeto está organizado em vários pacotes para uma melhor manutenção do código:
- `views`: Contém as diferentes telas da aplicação, como `AnunciosScreen`, `EmailsScreen`, etc.
- `viewmodels`: Contém os ViewModels responsáveis por gerir o estado da UI.
- `models`: Contém as classes de modelo, como `Anuncio` e `Pergunta`.
- `ui.theme`: Contém os ficheiros relacionados com a personalização de temas e cores.

## Como Executar o Projeto
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/username/MaieuticaStudentsApp.git

2\. **Abra o projeto no Android Studio**:

   - Certifique-se de que tem o Android Studio Arctic Fox (ou mais recente) instalado.

3\. **Compile e execute**:

   - Conecte um dispositivo ou utilize um emulador e clique em **Run**.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para relatar bugs, sugerir novas funcionalidades ou enviar pull requests.

## Contacto

Desenvolvido por **Gonçalo Garrido**. Para entrar em contacto, envie um e-mail para [goncalosantosgarrido@gmail.com](mailto:goncalosantosgarrido@gmail.com).

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o ficheiro `LICENSE` para mais detalhes.
