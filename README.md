<div align="center">

# 🗄️ Customer Database API

A Spring Boot 3 REST API for customers, with Spring Data JPA and PostgreSQL.

<a href="https://github.com/miladmo68/Customer-DataBase"><img src="https://img.shields.io/badge/Source-GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="Source code"></a>
<a href="https://miladweb.com"><img src="https://img.shields.io/badge/Portfolio-miladweb.com-1E3A8A?style=for-the-badge&logo=aboutdotme&logoColor=white" alt="Portfolio"></a>

</div>

## ✨ Features

- CRUD endpoints for customers
- Spring Data JPA
- PostgreSQL database

## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)

> [!NOTE]
> This is a backend API, so there is no web page to host. Run it locally with the steps below.

## 🚀 Getting Started

**Prerequisites:** Java 17+ (the Maven wrapper is included) · A running PostgreSQL server

**Run the API**

```bash
git clone https://github.com/miladmo68/Customer-DataBase.git
cd Customer-DataBase
./mvnw spring-boot:run
```

## 📡 API Endpoints

| Method | Path |
| --- | --- |
| `GET` | `/api/v1/customers` |
| `GET` | `/api/v1/customers/{email}` |
| `POST` | `/api/v1/customers` |
| `PUT` | `/api/v1/customers/{customer_id}` |
| `DELETE` | `/api/v1/customers/{customer_id}` |

## 📁 Project Structure

```
Customer-DataBase/
├── src/
└── pom.xml
```

## 👤 Author

**Milad Mohammadi** — Frontend-Focused Full-Stack Developer, Toronto 🇨🇦

[![Website](https://img.shields.io/badge/Website-miladweb.com-FF6A00?style=flat-square&logo=googlechrome&logoColor=white)](https://miladweb.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-miladmo68-0A66C2?style=flat-square&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/miladmo68/)
[![GitHub](https://img.shields.io/badge/GitHub-miladmo68-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/miladmo68)

<p align="center"><sub>If you like this project, consider giving it a ⭐</sub></p>
