# Maiêutica Students App

Bem-vindo à **Maiêutica Students App**, uma aplicação móvel projetada para melhorar a experiência académica dos alunos do ISMAI e IPMAIA. Este projeto, desenvolvido com **Jetpack Compose** e **Kotlin**, tem como objetivo fornecer informações, notícias e recursos úteis num ambiente intuitivo e moderno.

## Funcionalidades
- **Splash Screen Animada**: Apresenta uma tela de abertura com uma animação de fade-in.
- **Navegação Intuitiva**: Utilização da navegação do Jetpack para uma experiência de utilizador fluída entre as diferentes secções da aplicação.
- **Anúncios Detalhados**: Exibição de anúncios com suporte a Markdown para apresentar conteúdo formatado por formato xml.
- **Perguntas e Respostas**: Secção dedicada a perguntas frequentes sobre o ISMAI e IPMAIA por formato xml.
- **(*)Visualização de E-mails e Informações de Contacto**: Acesso fácil aos e-mails importantes e informações de contacto das instituições.
- **Temas Personalizados**: Suporte a temas claros e escuros, incluindo cores personalizadas que refletem a identidade visual do campus.
(*) - Inacabado por razões de segurança por falda de um Token microsoft para login dos utilizadores
## Capturas de Ecrã
| Captura de Ecrã | Descrição                          | Imagem                                                                            |
|------------------|------------------------------------|-----------------------------------------------------------------------------------|
| **Imagem 1**    | Maiutica Students - Horario. | <img src="https://github.com/user-attachments/assets/f35f753a-984b-4675-a654-1f50aa92700f" alt="Imagem 1" width="300"/> |
| **Imagem 2**    | Maiutica Students - E-mail.   | <img src="https://github.com/user-attachments/assets/2f798835-cc3d-4153-b43e-2acbc8abb67a" alt="Imagem 2" width="300"/> |
| **Imagem 3**    | Maiutica Students - P&R.      | <img src="https://github.com/user-attachments/assets/44c8f064-b86c-4b36-a860-eccc07a111f1" alt="Imagem 3" width="300"/> |
| **Imagem 4**    | Maiutica Students - P&R.  | <img src="https://github.com/user-attachments/assets/487c62cb-ddcc-427d-bb36-385237a59077" alt="Imagem 4" width="300"/> |
| **Imagem 5**    | Maiutica Students - Dentro de anuncios.  | <img src="https://github.com/user-attachments/assets/ea814fa2-2d06-4f9c-aa1d-faa87eccbb72" alt="Imagem 5" width="300"/> |
| **Imagem 6**    | Maiutica Students - Anuncios. | <img src="https://github.com/user-attachments/assets/ed2e433a-9eb5-491b-b8f9-d6f43d5227a9" alt="Imagem 6" width="300"/> |
| **Imagem 7**    | Maiutica Students - Principal.     | <img src="https://github.com/user-attachments/assets/dfa90e8e-c7fa-46e7-8f3c-7ddc8568b365" alt="Imagem 7" width="300"/> |



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
   git clone https://github.com/FaculdadeLicenciatura/MaieuticaStudentsApp.git

2\. **Abra o projeto no Android Studio**:

   - Certifique-se de que tem o Android Studio Arctic Fox (ou mais recente) instalado.

3\. **Compile e execute**:

   - Conecte um dispositivo ou utilize um emulador e clique em **Run**.

## Contacto

Desenvolvido por **Gonçalo Garrido**. Para entrar em contacto, envie um e-mail para [goncalosantosgarrido@gmail.com](mailto:goncalosantosgarrido@gmail.com).

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o ficheiro `LICENSE` para mais detalhes.
