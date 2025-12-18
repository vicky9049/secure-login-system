Secure REST API with Spring Boot & JWT
📌 Project Overview

This project is a secure backend authentication system built using Spring Boot and Spring Security, implementing JWT (JSON Web Token) based authentication.
It demonstrates how modern backend applications handle user login, password security, and protected API access in a stateless manner.
The application validates user credentials from a MySQL database, encrypts passwords using BCrypt, generates JWT tokens upon successful authentication, 
and uses those tokens to authorize access to secured endpoints.
This project is designed to follow industry-standard security practices and is suitable for real-world backend systems.


🎯Key Objectives

Implement secure user authentication using database-backed credentials
Replace basic authentication with JWT-based token authentication
Ensure password security using hashing techniques
Build stateless REST APIs using Spring Security
Demonstrate real-world backend security concepts

🧱 System Architecture

Controller Layer – Handles authentication requests
Service Layer – Loads users from database and applies business logic
Security Layer – Configures Spring Security, authentication providers, and password encoders
Persistence Layer – Manages user data using JPA and Hibernate
Database – Stores user credentials and roles securely

⚙️ Technologies Used
Java
Spring Boot
Spring Security
JWT (JSON Web Token)
Spring Data JPA
Hibernate
MySQL
BCrypt Password Encoder
Postman (API Testing)

✨ Features Implemented

User authentication using username and password
Password encryption using BCrypt hashing
JWT token generation after successful login
Stateless session management
Secured REST endpoints
Custom UserDetailsService for database authentication
AuthenticationProvider configuration using DaoAuthenticationProvider
API testing with positive and negative scenarios

🔐 Authentication Flow

User sends login request with username and password
Application fetches user details from MySQL database
Password is validated using BCrypt hashing
On successful authentication, JWT token is generated
Token is returned to the client
Client uses JWT token to access protected endpoints

🗄️ Database Design

Users Table
id – Primary Key
username – Unique username
password – Encrypted password (BCrypt)
roles – User role (e.g. ROLE_USER)
Passwords are never stored in plain text.

🧪 API Testing

All APIs were tested using Postman, including:
Valid login credentials
Invalid username/password scenarios
Unauthorized access attempts
