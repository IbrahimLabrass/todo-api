# Todo Web App (Backend)

This project is developed with Java and Spring Boot.

## How to Run the Application

1. **Clone the Backend Project**: 
git clone https://github.com/IbrahimLabrass/todo-api.git

2. **Import the Project**: 
- Open your preferred IDE (IntelliJ IDEA Community version is fully sufficient).
- Import the project into your IDE.

3. **Update and Build Dependencies**:
- Navigate to the project directory.
- Run the following command to update and build the project dependencies:
  ```
  mvn clean install -U
  ```

4. **Verify Installation**:
- After a successful build, ensure that the `target` folder contains the `.jar` and `swagger.json` files.

5. **Run the Application**:
- Open the `TodoApplication.java` file located in the source directory.
- Run the application by clicking on the green play button or using your IDE's equivalent run command.

6. **Access Swagger UI**:
- Once the application is running, you can access the Swagger UI to interact with the API endpoints.
- Open a web browser and navigate to: `http://localhost:8080/swagger-ui.html`

## Additional Notes

- Ensure that you have Java and Maven installed on your system.
- If you encounter any issues during setup or execution, refer to the project documentation or seek assistance from the project contributors.
