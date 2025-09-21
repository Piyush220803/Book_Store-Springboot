# 📚 BookStore Application

A modern Spring Boot web application for managing books, featuring a beautiful industry-level UI and demo data for instant exploration.

---

## 🚀 Features

- Add, edit, and delete books
- Personal "My Books" list
- Responsive, modern UI (Bootstrap 5, gradients, glassmorphism)
- Demo data auto-loaded on startup
- H2 in-memory database for easy setup

---


## 🖼️ Screenshot Gallery

| Available Books                                                      | Book Register                                                      | Edit Book                                                      | My Books                                                      |
| -------------------------------------------------------------------- | ------------------------------------------------------------------ | -------------------------------------------------------------- | ------------------------------------------------------------- |
| ![Available Books](screenshots/Screenshot/avaiable-book.png) | ![Book Register](screenshots/Screenshot/add-book.png) | ![Edit Book](screenshots/Screenshot/home.png) | ![My Books](screenshots/Screenshot/my-book.png) |

---

## 🏁 Getting Started

1. **Clone the repository**
   ```bash
   git clone <your-repo-url>
   cd bookStore
   ```
2. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```
3. **Open in browser**
   - Home: [http://localhost:8080/](http://localhost:8080/)
   - Book Register: [http://localhost:8080/book_register](http://localhost:8080/book_register)
   - Available Books: [http://localhost:8080/available_books](http://localhost:8080/available_books)
   - My Books: [http://localhost:8080/my_books](http://localhost:8080/my_books)
   - H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---

## 🛠️ Tech Stack

- Java 11+
- Spring Boot
- Spring Data JPA
- Thymeleaf
- Bootstrap 5
- H2 Database

---

## 📂 Folder Structure

```
bookStore/
├── src/main/java/com/bookStore/
│   ├── controller/
│   ├── entity/
│   ├── repository/
│   ├── service/
│   └── DemoDataLoader.java
├── src/main/resources/templates/
│   ├── home.html
│   ├── bookRegister.html
│   ├── bookEdit.html
│   ├── bookList.html
│   └── myBooks.html
├── src/main/resources/application.properties
├── pom.xml
└── README.md
```

---

## 👤 Contributors

- Piyush Pandey

---

## 📄 License

This project is licensed under the Apache License 2.0.
