# Photoz Spring Boot Application

## Overview

Photoz is a Spring Boot application designed for managing photos. It allows users to upload, store, and retrieve photos, utilizing a relational database for storage. The application provides a RESTful API for photo management and integrates with an H2 database for development and testing.

## Features

- Photo storage with metadata (file name, content type, and binary data).
- RESTful API for photo management.
- Integration with H2 database for development and testing.

## Prerequisites

Ensure you have the following installed:

- Java 17 or later
- Maven 3.8+

## Getting Started

### Clone the Repository

To get started, clone the repository:

```bash
git clone https://github.com/alifiyah29/Photoz.git
cd Photoz
```

### Configuration

#### Application Properties

Update the `application.properties` file located in `src/main/resources/` to configure the application. For example:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.h2.console.enabled=true
server.port=8081
```

#### Database Initialization

Ensure that the `bacschema.sql` file in the `src/main/resources/` folder contains valid SQL statements to initialize your database schema. For example:

```sql
CREATE TABLE IF NOT EXISTS photoz (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    file_name VARCHAR(255),
    content_type VARCHAR(255),
    data BLOB
);
```

## Build and Run

### Build the Project

To build the project, run the following Maven command:

```bash
mvn clean install
```

### Run the Application

To run the application, use the following Maven command:

```bash
mvn spring-boot:run
```

## Access the Application

- **API Documentation**: [http://localhost:8081/swagger-ui.html](http://localhost:8081/swagger-ui.html) (if Swagger is configured)
- **H2 Console**: [http://localhost:8081/h2-console](http://localhost:8081/h2-console)

## Troubleshooting

### Common Errors

- **SQL Syntax Error**: Ensure the `bacschema.sql` file is correctly formatted and matches the database dialect.
- **Port Already in Use**: If the default port is already in use, update the `server.port` in `application.properties` to an available port.

### Logs

Check the application logs for detailed error messages. Logs are displayed in the console during runtime.

## Contribution

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Submit a pull request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
