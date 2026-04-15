# Aplicativo de Gestão de Cadastro (Android Kotlin)

Este aplicativo Android foi desenvolvido em **Kotlin**, compatível com a **API 27 (Android 8.1 Oreo)**, seguindo as melhores práticas de desenvolvimento, Material Design e gerenciamento correto do ciclo de vida das Activities.

---

## Desenvolvedor

**Leonardo Estevão Alves**  
Registro Acadêmico: **00250458-1**  
Curso: **Engenharia de Software**

---

## Funcionalidades e Telas

O aplicativo é composto por 3 Activities principais:

### 1. Tela Principal (Cadastro)
- **Layout:** Utiliza `RelativeLayout` como container principal e `LinearLayout` horizontal para organizar os campos.
- **Campos:** Nome (Texto), Idade (Numérico) e Endereço (Postal Address).
- **Validação:** Verifica se os campos estão vazios antes de prosseguir.
- **Menu:** Opção "Sobre" acessível via menu na ActionBar (Always Show).
- **Ciclo de Vida:** Registra todos os estados (onCreate, onStart, onResume, etc.) via Logcat.

### 2. Tela de Confirmação
- **Exibição:** Mostra os dados recebidos da primeira tela via `Intent`.
- **Botão Sim:** Exibe um `Toast` de sucesso, limpa os campos e retorna à tela inicial.
- **Botão Não:** Retorna à tela inicial mantendo os dados preenchidos (pré-carregamento via `Intent`).

### 3. Tela Sobre
- **Acesso:** Disponível apenas a partir da tela principal.
- **Design:** Estilizada com Material Design, incluindo ícone de informação.
- **Conteúdo:** Informações do desenvolvedor, RA e curso.

---

## Especificações Técnicas

- **Linguagem:** Kotlin
- **SDK Mínimo:** API 27 (Android 8.1 Oreo)
- **Design:** Material Design (MaterialComponents)
- **Internacionalização:** 100% dos textos gerenciados via `strings.xml`.
- **Cores:** Paleta de cores complementares (Azul e Laranja) definida em `colors.xml`.
- **Documentação:** Classes e métodos principais documentados com **Javadocs**.

---

## Como Executar o Projeto

1.  Importe a pasta do projeto no **Android Studio**.
2.  Certifique-se de que o SDK da API 27 está instalado.
3.  Sincronize o projeto com o Gradle.
4.  Execute em um emulador ou dispositivo físico com Android 8.1 ou superior.
5.  Acompanhe o ciclo de vida das Activities através do **Logcat** filtrando pela TAG das Activities.

---

*Projeto desenvolvido para fins acadêmicos com foco em transição entre telas, Intents e Ciclo de Vida Android.*
