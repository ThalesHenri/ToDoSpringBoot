# 🚀 Fullstack Todo List (Spring Boot + Angular)

Projeto desenvolvido como speedrun para demonstração de arquitetura fullstack moderna utilizando **Spring Boot 3 (Java 21)** no backend e **Angular (Standalone Components)** no frontend.

---

## 🛠️ Tecnologias Utilizadas

### Backend
* **Java 21** (LTS)
* **Spring Boot 3**
* **Spring Data JPA** (Hibernate)
* **H2 Database** (Banco de dados em memória para desenvolvimento)
* **Spring Validation** & **Lombok**
* **Gradle** (Gerenciador de dependências)

### Frontend
* **Angular** (com Standalone Components e Signals)
* **TypeScript**
* **HttpClient** para consumo de API REST

---

## 📁 Estrutura do Repositório

```text
meu-projeto-todo/
├── backend/               # API REST em Spring Boot
└── frontend/              # Aplicação SPA em Angular
```

# ⚙️ Como Executar o Projeto
1. Clonar o RepositórioBashgit clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
cd seu-repositorio

## 2. Rodar o Backend (Spring Boot)Entre na pasta do backend e execute o Gradle Wrapper:Bashcd backend
### Linux / macOS / WSL
./gradlew bootRun

### Windows (PowerShell / CMD)
.\gradlew.bat bootRun A API estará rodando em: http://localhost:8080
Console do banco H2 (opcional): http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:tododb, User: sa, Senha: vazio)

## 3. Rodar o Frontend (Angular)Abra outro terminal na raiz do projeto, entre na pasta do frontend e inicie o servidor de desenvolvimento:Bashcd frontend
npm install
ng serve
A aplicação estará rodando em: http://localhost:4200

## 🔌 Endpoints da API 
(/api/tasks)Método Endpoint Descrição
GET/api/tasks Retorna todas as tarefas
GET/api/tasks/{id} Retorna uma tarefa específica
POST/api/tasks Cria uma nova tarefa
PUT/api/tasks/{id} Atualiza uma tarefa existente
DELETE/api/tasks/{id} Remove uma tarefa
👨‍💻 Desenvolvido por Thales Henrique  [GitHub](https://github.com/ThalesHenri)
