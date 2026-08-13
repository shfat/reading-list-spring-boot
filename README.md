# Reading List 

A simple Spring Boot web application for managing a personal reading list.

## Overview

This project was developed as an educational project while learning Spring Boot, Spring MVC, Spring Data JPA, Thymeleaf, and H2 Database.

Users can view their reading list and add new books through a simple web interface.

## Features

- View books associated with a reader
- Add books to a reading list
- Store book information in an H2 database
- Server-side HTML rendering with Thymeleaf
- Database interaction using Spring Data JPA
- Automatic ID generation with JPA

## Technologies

- Java 21
- Spring Boot 4.1.0
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- H2 Database
- Maven

## Project Structure

```text
src/
└── main/
    ├── java/com/springBook/readingList/
    │   ├── ReadingListApplication.java
    │   ├── Book.java
    │   ├── ReadingListController.java
    │   └── ReadingListRepository.java
    │
    └── resources/
        ├── templates/
        │   └── readingList.html
        └── static/
            └── style.css
