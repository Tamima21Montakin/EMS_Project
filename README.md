# Employee Management System Backend

This project is a Spring Boot backend for an Employee Management System.

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Spring Web
* Lombok

## API Endpoints

### Create Employee
* **POST /api/employees**
  * Creates a new employee.
  * Request body should contain the employee's details in JSON format (e.g., name, email, position).

### Get Employee by ID
* **GET /api/employees/{id}**
  * Retrieves an employee by their ID.
  * Replace `{id}` with the actual ID of the employee.

### Get All Employees
* **GET /api/employees**
  * Retrieves a list of all employees.

**Note:** Endpoints for updating and deleting employees are not yet implemented.

## Key Components

### `Employee` Entity
* Represents an employee in the system.
* Fields:
    * `id` (Long): The unique identifier for the employee.
    * `name` (String): The name of the employee.
    * `email` (String): The email address of the employee.
    * `position` (String): The job position of the employee.

### `EmployeeDto` (Data Transfer Object)
* Used to transfer employee data between layers (e.g., controller and service).
* Typically mirrors the fields of the `Employee` entity.

### `EmployeeMapper`
* Responsible for mapping between `Employee` entities and `EmployeeDto` objects.
* Simplifies the conversion process and avoids manual mapping.

### `EmployeeRepository`
* Extends Spring Data JPA's `JpaRepository`.
* Handles database interactions for the `Employee` entity (e.g., saving, finding, deleting employees).

### `EmployeeServiceDtoImpl`
* Implements the `EmployeeService` interface.
* Contains the business logic for employee-related operations.
* Uses `EmployeeRepository` for data access and `EmployeeMapper` for DTO conversion.
* **Note:** The `updateEmployee` method in this service is not yet implemented.
