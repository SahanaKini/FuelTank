# RoadRescue - Starter Project (Java Spring Boot + MySQL)

This is a minimal starter project for **RoadRescue / FuelTank** inspired by the screenshots you uploaded.
It contains:
- Spring Boot backend with REST endpoints for users, providers and requests.
- Static frontend pages (index, user register, provider signup, admin overview).
- MySQL configuration (edit `application.properties` with your DB credentials).

## How to run

1. Install Java 17+ and Maven.
2. Create a MySQL database named `roadrescue_db` (or change the name in `application.properties`).
3. Update `src/main/resources/application.properties` with your MySQL username/password.
4. From the project root run:
```
mvn spring-boot:run
```
5. Open http://localhost:8080 in your browser.

## Notes
- This is a starter skeleton to help you build the full features.
- Add validation, security (password hashing), and file uploads as needed.
- You can expand frontend to match the provided screenshots more closely.

