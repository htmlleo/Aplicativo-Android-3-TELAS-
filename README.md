# Aplicativo-Android-3-TELAS-
# 📱 Gestão de Cadastro - Android App

Este é um aplicativo Android profissional desenvolvido como parte de um projeto acadêmico, focado na gestão de cadastros de usuários, aplicação de **Material Design**, gerenciamento do **Ciclo de Vida de Activities** e boas práticas de desenvolvimento Android.

---

## 👤 Desenvolvedores
*   Nome: Leonardo Estevão Alves
*   Registro: Acadêmico (RA): 00250458-1
*   Nome: Vinicius Correia De Andrade 
*   Registro: Acadêmico (RA): 251953-1
*   **Curso:** Análise e Desenvolvimento de Sistemas

---

## 🚀 Funcionalidades

O aplicativo é composto por três telas principais, cada uma com objetivos específicos:

### 1. Tela de Cadastro (MainActivity)
*   **Layout:** Construído com `RelativeLayout` como container principal e `LinearLayouts` horizontais para alinhar labels e campos, garantindo um visual limpo e profissional.
*   **Entrada de Dados:** Campos para Nome, Idade (com teclado numérico) e Endereço.
*   **Navegação:** Botão "Salvar" de largura total que valida os campos e transiciona para a tela de confirmação.
*   **Menu:** Acesso direto à tela "Sobre" através de um ícone do Material Design na Toolbar (Always Show).

### 2. Tela de Confirmação (ConfirmationActivity)
*   **Exibição:** Apresenta os dados inseridos em um `CardView` elegante para destacar as informações.
*   **Decisão:** Pergunta ao usuário se os dados estão corretos.
    *   **Botão SIM:** Exibe um `Toast` de sucesso, limpa os campos e retorna à tela inicial.
    *   **Botão NÃO:** Retorna à tela inicial mantendo os dados preenchidos para edição (pré-carregamento via `Intent`).

### 3. Tela Sobre (AboutActivity)
*   **Identificação:** Contém os dados do desenvolvedor, RA, curso e uma descrição do projeto.
*   **Design:** Layout criativo utilizando ícones do Material Design e cards para uma apresentação profissional.

---

## 🛠️ Tecnologias e Padrões Utilizados

*   **Linguagem:** Kotlin
*   **Java:** Versão 21 (Compatível com Android Studio moderno)
*   **Gradle:** 8.5
*   **Android Gradle Plugin (AGP):** 8.2.2
*   **Material Design 3:** Aplicação de cores complementares (Azul Profissional e Laranja) e componentes modernos.
*   **Internacionalização:** Todos os textos centralizados em `strings.xml`.
*   **Ciclo de Vida:** Monitoramento completo dos estados das Activities via Logs detalhados (`Log.d`, `Log.i`, `Log.w`, `Log.e`).
*   **Documentação:** Código-fonte 100% documentado com **Javadoc**.

---

## ⚙️ Como Importar o Projeto

1.  Faça o download do arquivo `.zip` do projeto.
2.  Extraia o conteúdo em uma pasta de sua preferência.
3.  Abra o **Android Studio** (versão Hedgehog ou superior recomendada).
4.  Vá em `File > Open` e selecione a pasta extraída.
5.  Aguarde a sincronização do Gradle (certifique-se de estar usando o JDK 21 nas configurações do Android Studio).
6.  Execute o aplicativo em um emulador ou dispositivo físico.

---

## 📝 Licença
Este projeto foi desenvolvido para fins estritamente acadêmicos.
