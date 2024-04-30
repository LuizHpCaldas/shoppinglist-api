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

# Shopping List Application - Spring Boot

This is a shopping list application developed with Spring Boot, Angular, and H2 Database. It allows users to create shopping lists, add items to those lists, mark items as purchased during shopping, and calculate the partial total of the marked items.

## Prerequisites

Make sure you have the following installed on your machine:
- Java JDK 8 or higher
- Maven
- Node.js and Angular CLI (if you want to run the Angular frontend locally)

## Running the Application

1. **Backend (Spring Boot):**
   - Navigate to the `backend` directory:
     ```
     cd backend
     ```
   - Execute the following command to start the Spring Boot server:
     ```
     mvn spring-boot:run
     ```

2. **Frontend (Angular):**
   - Navigate to the `frontend` directory:
     ```
     cd frontend
     ```
   - Execute the following command to install Angular dependencies:
     ```
     npm install
     ```
   - Start the Angular development server:
     ```
     ng serve
     ```
   - Open your browser and navigate to `http://localhost:4200/` to view the frontend application.

## Accessing the H2 Database

- The H2 console can be accessed at `http://localhost:8080/h2-console` while the Spring Boot application is running.
- Use the following settings to connect to the database:
  - JDBC URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: leave blank or remove

## Contribution

Contributions are welcome! Feel free to open issues or submit pull requests.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
