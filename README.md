# Employee Management — Spring + Hibernate

A Java project for exploring Spring's dependency injection and Hibernate's ORM layer together. Built as a learning exercise around the Spring-Hibernate integration pattern.

## What it does

Basic employee CRUD backed by MySQL. The app follows a layered architecture:

```
Client → EmployeeService → EmployeeDAO (interface) → EmployeeDAOImpl (Hibernate)
```

The `EmployeeDAOImpl` talks to the database through Hibernate's `SessionFactory`, configured via Spring's XML context (`config.xml`).

## Setup

You'll need Java, Maven, and a running MySQL instance.

1. Create the database schema:
   ```sql
   source src/mysql.sql
   ```

2. Update `src/config.xml` with your DB credentials (host, username, password).

3. Build and run from Eclipse (the project has `.classpath` and `.project` files included) or import as a Maven project.

## Project structure

```
src/
  client/       — entry point (Client.java)
  domain/       — Employee model
  repo/         — EmployeeDAO interface + Hibernate implementation
  service/      — EmployeeService wrapping the DAO
  config.xml    — Spring context with Hibernate SessionFactory bean
  mysql.sql     — schema + seed data
```

