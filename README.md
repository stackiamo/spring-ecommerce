# 🛍️ Spring Shop Microservices Tutorial

This repository contains a **basic educational project** built with **Spring Boot**, designed to demonstrate how to create a **microservices-based backend** for an e-commerce system.

The application focuses on **managing products, users, carts, and orders**, exposing RESTful APIs suitable for beginners who want to learn how to structure and connect multiple Spring services.

---

## 🎯 Objective & Purpose

**Goal:**  
Provide a clear and minimal example of how to design and implement a **Spring Boot microservices architecture**, where services communicate to handle:

- 📦 Product catalog management
- 🧾 Order and cart management
- 👤 User management
- 🧠 Data integration through JPA repositories and service APIs

This tutorial aims to be a **starting point** for learning microservices design patterns, REST API creation, and clean separation of concerns.

---

## 🧩 Architecture Overview

The system is split into **two main microservices**:

1. **Warehouse Service**
    - Manages products and their details
    - Exposes endpoints to list, create, and update items
    - Connects to the *Product* database schema

2. **Order Service**
    - Handles users, carts, and orders
    - Manages shopping flow and order creation
    - Connects to the *User/Order* database schema

Communication between services happens via REST calls.

```mermaid
graph TD
    A[Client / Frontend] --> B[API Gateway]
    B --> C[Warehouse Service]
    B --> D[Order Service]
    C --> E[(Products DB)]
    D --> F[(Orders & Users DB)]