# 🏠 Week 1 Housing Project - Spring Boot & Builder Pattern

This is a sample Spring Boot project developed as a part of **Getir Cohort Week-1 project**.  
It demonstrates **clean architecture**, **SOLID principles**, **Builder Pattern**, and RESTful API design using **Spring Boot**, **Spring Data JPA**, and **H2 in-memory database**.

---

## 📦 Tech Stack

- Java 23
- Spring Data JPA
- H2 Database
- Lombok (with Builder Pattern)
- Maven

---

## 🛠️ Project Structure
```plaintext
src/
└── main/
├── java/
│    └── com.getir.week1project/
│          ├── controller/
│          ├── model/
│          ├── repository/
│          ├── service/
│          ├── config/
│          └── Week1ProjectApplication.java
└── resources/
└── application.properties
```

---

## 🏗️ Features

- House, Villa, SummerHouse entities built with Builder Pattern
- `BaseHouse` is an abstract superclass with common attributes
- Auto-loaded mock data via `DataInitializer`
- Business logic handled by `HouseService`
- REST API for:
    - Total price per type
    - Average square meters per type
    - Filtering by room and living room count

---

## 🚀 How to Run

1. Make sure **Java 23** is installed
2. Clone the repository
3. Run the following commands in the project root:

```bash
mvn clean install
mvn spring-boot:run
```

## 🌐 API Endpoints

| Method | Endpoint                                  | Description                                           |
|--------|-------------------------------------------|-------------------------------------------------------|
| GET    | `/api/houses/houses`                      | Get all House entities                                |
| GET    | `/api/houses/villas`                      | Get all Villa entities                                |
| GET    | `/api/houses/summerhouses`                | Get all SummerHouse entities                          |
| GET    | `/api/houses/total-price/houses`          | Get total price of all Houses                         |
| GET    | `/api/houses/total-price/villas`          | Get total price of all Villas                         |
| GET    | `/api/houses/total-price/summer-houses`   | Get total price of all SummerHouses                   |
| GET    | `/api/houses/total-price/all`             | Get total price of all property types combined        |
| GET    | `/api/houses/average-square-meters/houses`| Get average square meters of all Houses               |
| GET    | `/api/houses/average-square-meters/villas`| Get average square meters of all Villas               |
| GET    | `/api/houses/average-square-meters/summer-houses` | Get average square meters of all SummerHouses |
| GET    | `/api/houses/average-square-meters/all`   | Get average square meters of all property types       |
| GET    | `/api/houses/filter?roomCount=3&livingRoomCount=1` | Filter all properties by room and living room count |
---
## Principles Used
- ✅ Principles Used
- ✅ Builder Pattern
- ✅ Repository Pattern 
- ✅ SOLID Principles 
- ✅ Clean Architecture
- ✅ RESTful Web Services