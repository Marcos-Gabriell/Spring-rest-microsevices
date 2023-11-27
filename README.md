# CRUD SPRING REST

## Resumo
Este é um projeto CRUD básico desenvolvido em Java com Spring REST e Spring Data JPA, integrado ao banco de dados PostgreSQL. O objetivo é fornecer operações de criação, leitura, atualização e exclusão (CRUD) para a entidade "Usuário". Até o momento, o projeto se encontra pausado durante a implementação da gestão de requisições e na melhoria da segurança da aplicação.

## Endpoints

### 1. Obter Relatório
- **Endpoint:** `GET /usuario/{id}/codigovenda/{venda}`
- **Descrição:** Retorna um relatório para o usuário com o ID especificado e o código de venda fornecido.
- **Exemplo de Uso:** `/usuario/1/codigovenda/123`
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo as informações do usuário.
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.

### 2. Obter Usuário por ID
- **Endpoint:** `GET /usuario/{id}`
- **Descrição:** Retorna as informações do usuário com o ID especificado.
- **Exemplo de Uso:** `/usuario/1`
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo as informações do usuário.
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.

### 3. Excluir Usuário por ID
- **Endpoint:** `DELETE /usuario/{id}`
- **Descrição:** Exclui o usuário com o ID especificado.
- **Exemplo de Uso:** `/usuario/1`
- **Resposta Sucesso:** Status HTTP 200 OK com a mensagem "Deletado com sucesso!".
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.

### 4. Obter Lista de Usuários
- **Endpoint:** `GET /usuario/`
- **Descrição:** Retorna uma lista de todos os usuários cadastrados.
- **Exemplo de Uso:** `/usuario/`
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo a lista de usuários.
- **Resposta Erro:** Status HTTP 404 Not Found se nenhum usuário for encontrado.

### 5. Cadastrar Usuário
- **Endpoint:** `POST /usuario/`
- **Descrição:** Cadastra um novo usuário.
- **Exemplo de Uso:** `/usuario/`
- **Corpo da Requisição:** JSON com as informações do usuário.
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo as informações do usuário cadastrado.
- **Resposta Erro:** Status HTTP 400 Bad Request se a requisição estiver mal formada.

### 6. Atualizar Usuário
- **Endpoint:** `PUT /usuario/`
- **Descrição:** Atualiza as informações do usuário.
- **Exemplo de Uso:** `/usuario/`
- **Corpo da Requisição:** JSON com as informações atualizadas do usuário.
- **Resposta Sucesso:** Status HTTP 200 OK com o corpo contendo as informações do usuário atualizado.
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.

### 7. Atualizar Venda para Usuário
- **Endpoint:** `PUT /usuario/{iduser}/idvenda/{idvenda}`
- **Descrição:** Atualiza a venda associada ao usuário.
- **Exemplo de Uso:** `/usuario/1/idvenda/456`
- **Resposta Sucesso:** Status HTTP 200 OK com a mensagem "Venda atualizada".
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.

### 8. Cadastrar Venda para Usuário
- **Endpoint:** `POST /usuario/{iduser}/idvenda/{idvenda}`
- **Descrição:** Cadastra uma nova venda para o usuário.
- **Exemplo de Uso:** `/usuario/1/idvenda/789`
- **Resposta Sucesso:** Status HTTP 200 OK com a mensagem contendo informações da venda.
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.

---

**Observação:**
O desenvolvimento está temporariamente pausado durante a implementação da gestão de requisições e reforço da segurança da aplicação.

---
