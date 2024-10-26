# Rule Engine Application

This project is a 3-tier rule engine application designed to evaluate user eligibility based on dynamic rules created through an Abstract Syntax Tree (AST). The system allows for rule creation, combination, modification, and evaluation based on user attributes like age, department, income, and experience.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Build Instructions](#build-instructions)
- [Dependencies](#dependencies)
- [Design Choices](#design-choices)

---

## Project Overview

The Rule Engine is a Java-based application structured in a 3-tier architecture:
1. **Simple UI** - Command-line interface to interact with the rule engine.
2. **API and Backend** - Logic to parse rules, evaluate them, and interact with the AST.
3. **Data Layer** - Manages data for rules, user attributes, and AST structure.

### Features

- **Dynamic Rule Parsing**: Parses string-based rules into AST nodes.
- **Rule Evaluation**: Evaluates rules against user-defined data attributes.
- **Flexible Rule Combination**: Combines rules to create complex eligibility conditions.

---

## Build Instructions

To build and run the project:

1. **Clone the Repository**
    ```bash
    git clone https://github.com/your-username/Rule-Engine-Project.git
    cd Rule-Engine-Project
    ```

2. **Compile the Code**
    Navigate to the `src` directory and compile the Java classes.
    ```bash
    javac src/main/java/**/*.java
    ```

3. **Run the Application**
    Run the main Java class with user input for rule evaluation.
    ```bash
    java -cp src main.java.Main
    ```

---

## Dependencies

- **Java**: Java 17 or later.
- **Docker**: For optional containerized database and server setup.

To set up the database and other dependencies via Docker, refer to the `docker-compose.yml` file.

---

## Design Choices

### Architecture

This application is structured as a 3-tier architecture:
1. **Controller Layer**: Handles rule parsing and processing.
2. **Service Layer**: Manages rule evaluation logic and AST parsing.
3. **Data Layer**: Represents the AST structure and user attributes.

### AST Representation

The AST nodes are designed with attributes:
- **type**: Indicates whether a node is an operator (`AND`, `OR`) or an operand (conditions like `age > 30`).
- **left** and **right**: Pointers to child nodes, supporting complex rule combinations.
- **value**: Holds the condition value for operand nodes.

---

## Running in Docker (Optional)

For a containerized setup, use `docker-compose` to start the application with any required dependencies, such as a database.

1. **Build and Run Containers**
    ```bash
    docker-compose up --build
    ```

2. **Stop Containers**
    ```bash
    docker-compose down
    ```

For more information, refer to the official documentation on Docker and Docker Compose.

---

## Testing

- To test, input user attributes as JSON and run the `evaluateRule` method.
- Sample inputs and expected outputs can be found in the `tests/` directory.

---

## License

This project is licensed under the MIT License.
