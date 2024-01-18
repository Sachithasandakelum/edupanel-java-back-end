# EduPanel - Java API

## Introduction

Welcome to EduPanel, a comprehensive education management system with a layered software architecture. This project includes a back-end API developed in Java using the Spring framework. EduPanel aims to streamline the management of lecturers, providing features for creating, updating, and retrieving lecturer details.

## Technologies Used

The EduPanel Java API leverages various technologies to achieve its goals:

- **Spring Boot:** The project is built using the Spring Boot framework, providing a simplified and convention-over-configuration approach to building robust Java applications.

- **Spring Data JPA:** EduPanel uses Spring Data JPA for simplified data access through the Java Persistence API (JPA). It facilitates database interactions and reduces boilerplate code.

- **Google Cloud Storage:** For handling file uploads and storage, Google Cloud Storage is utilized. This allows efficient management of lecturer profile pictures and LinkedIn URLs.

- **Firebase Admin SDK:** Firebase is integrated for authentication and additional cloud functionalities. The Firebase Admin SDK assists in managing user authentication and authorization.

- **ModelMapper:** ModelMapper is employed for simplifying the mapping of objects between layers, making it easier to convert between different data structures.

- **MySQL Connector/J:** MySQL Connector/J is used to connect the Java application to the MySQL database. It enables communication with the relational database system.

- **Lombok:** Project Lombok is used to reduce boilerplate code by providing annotations to generate common code structures, enhancing code conciseness.

- **H2 Database (Test Scope):** H2 Database is used for testing purposes, providing an in-memory database for unit testing.

- **Spring Boot DevTools (Runtime Scope):** Spring Boot DevTools aids in development by providing additional tools and automatic application restarts during development.

## Handling Lecturers

The API offers endpoints to manage lecturer details, including creating new lecturers, updating details via multipart form data or JSON, retrieving a list of all lecturers, and more.


![Screenshot from 2024-01-18 12-33-30.png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20from%202024-01-18%2012-33-30.png)

![Screenshot from 2024-01-18 12-34-06.png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20from%202024-01-18%2012-34-06.png)

![Screenshot from 2024-01-18 12-34-34.png](..%2F..%2F..%2F..%2FPictures%2FScreenshots%2FScreenshot%20from%202024-01-18%2012-34-34.png)

## License

This project is licensed under the [MIT License](LICENSE.txt).