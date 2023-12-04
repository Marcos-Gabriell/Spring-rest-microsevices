# CRUD SPRING REST

## Resumo

Este é um projeto CRUD básico desenvolvido em Java com Spring REST e Spring Data JPA, integrado ao banco de dados PostgreSQL. O objetivo é fornecer operações de criação, leitura, atualização e exclusão (CRUD) para a entidade "Usuário". Até o momento, o projeto está pausado durante a implementação da gestão de requisições e na melhoria da segurança da aplicação.

## Endpoints

### 1. Obter Usuário por ID
- **Endpoint:** `GET /usuario/{id}`
- **Descrição:** Retorna as informações do usuário com o ID especificado.
- **Exemplo de Uso:** `/usuario/1`
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo as informações do usuário.
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.

### 2. Excluir Usuário por ID
- **Endpoint:** `DELETE /usuario/{id}`
- **Descrição:** Exclui o usuário com o ID especificado.
- **Exemplo de Uso:** `/usuario/1`
- **Resposta Sucesso:** Status HTTP 200 OK com a mensagem "Deletado com sucesso!".
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.

### 3. Listar Todos os Usuários
- **Endpoint:** `GET /usuario/`
- **Descrição:** Retorna a lista de todos os usuários.
- **Exemplo de Uso:** `/usuario/`
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo a lista de usuários.
- **Resposta Erro:** Status HTTP 404 Not Found se não houver usuários.

### 4. Cadastrar Usuário
- **Endpoint:** `POST /usuario/`
- **Descrição:** Cadastra um novo usuário.
- **Exemplo de Uso:** `/usuario/`
- **Corpo da Requisição:** JSON contendo os dados do novo usuário.
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo as informações do usuário cadastrado.

### 5. Atualizar Usuário
- **Endpoint:** `PUT /usuario/`
- **Descrição:** Atualiza os dados de um usuário existente.
- **Exemplo de Uso:** `/usuario/`
- **Corpo da Requisição:** JSON contendo os dados atualizados do usuário.
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo as informações do usuário atualizado.

### 6. Obter Venda por ID do Usuário
- **Endpoint:** `GET /usuario/{iduser}/idvenda/{idvenda}`
- **Descrição:** Retorna as informações da venda com o ID especificado para o usuário.
- **Exemplo de Uso:** `/usuario/1/idvenda/123`
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo as informações da venda.
- **Resposta Erro:** Status HTTP 404 Not Found se a venda não for encontrada.

### 7. Cadastrar Venda para Usuário
- **Endpoint:** `POST /usuario/{iduser}/idvenda/{idvenda}`
- **Descrição:** Cadastra uma nova venda para o usuário com o ID especificado.
- **Exemplo de Uso:** `/usuario/1/idvenda/123`
- **Resposta Sucesso:** Status HTTP 200 OK com a mensagem indicando que a venda foi cadastrada.

# Como Executar

Para executar este projeto em seu computador local, siga as etapas abaixo:

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes pré-requisitos instalados em seu sistema:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- [PostgreSQL](https://www.postgresql.org/download/)

### Clonar o Projeto

1. Clone este repositório.
2. Abra o projeto em sua IDE Java (Eclipse, IntelliJ, etc.).
3. Execute a aplicação no método main.
   
## Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL com o nome `curso_spring`.
2. Configure as credenciais do banco de dados no arquivo `src/main/resources/application.properties`.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/curso_spring
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
