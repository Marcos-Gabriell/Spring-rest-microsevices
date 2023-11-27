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

---

**Observação:**
O desenvolvimento está temporariamente pausado durante a implementação da gestão de requisições e reforço da segurança da aplicação.

---
