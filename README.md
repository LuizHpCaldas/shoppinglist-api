# Lista de Compras (Shopping List) - Aplicação Spring Boot

Esta é uma aplicação de lista de compras desenvolvida com Spring Boot, Angular e H2 Database. Permite aos usuários criar listas de compras, adicionar itens a essas listas, marcar itens como comprados durante a ida ao mercado e calcular o total parcial dos itens marcados.

## Pré-requisitos

Certifique-se de ter o seguinte instalado em sua máquina:
- Java JDK 8 ou superior
- Maven
- Node.js e Angular CLI (se você deseja executar o frontend Angular localmente)

## Executando a Aplicação

1. **Backend (Spring Boot):**
   - Navegue até o diretório `backend`:
     ```
     cd backend
     ```
   - Execute o seguinte comando para iniciar o servidor Spring Boot:
     ```
     mvn spring-boot:run
     ```

2. **Frontend (Angular):**
   - Navegue até o diretório `frontend`:
     ```
     cd frontend
     ```
   - Execute o seguinte comando para instalar as dependências do Angular:
     ```
     npm install
     ```
   - Inicie o servidor de desenvolvimento do Angular:
     ```
     ng serve
     ```
   - Abra o navegador e acesse `http://localhost:4200/` para visualizar a aplicação frontend.

## Acesso ao Banco de Dados H2

- O console H2 pode ser acessado em `http://localhost:8080/h2-console` durante a execução da aplicação Spring Boot.
- Use as seguintes configurações para se conectar ao banco de dados:
  - JDBC URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: deixe em branco ou remova

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
