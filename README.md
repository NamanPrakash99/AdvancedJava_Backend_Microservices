<div align="center">

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="55" alt="Spring Boot"/>
&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="55" alt="Java"/>
&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" width="55" alt="Docker"/>
&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/rabbitmq/rabbitmq-original.svg" width="55" alt="RabbitMQ"/>
&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" width="55" alt="PostgreSQL"/>
&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/redis/redis-original.svg" width="55" alt="Redis"/>
&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/netflix/netflix-original.svg" width="55" alt="Netflix Eureka"/>
&nbsp;&nbsp;
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/eclipse/eclipse-original.svg" width="55" alt="Spring Tool Suite (Eclipse)"/>

# ☁️ Microservices — Complete Workspace

> A collection of **Spring Boot Microservice** projects covering service discovery, API gateways, inter-service communication, RabbitMQ messaging, and more.

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-Messaging-FF6600?style=flat-square&logo=rabbitmq&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-4169E1?style=flat-square&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Container-2496ED?style=flat-square&logo=docker&logoColor=white)
![Eureka](https://img.shields.io/badge/Eureka-Service_Discovery-E50914?style=flat-square&logo=netflix&logoColor=white)
![Feign](https://img.shields.io/badge/OpenFeign-Client-6DB33F?style=flat-square&logo=spring&logoColor=white)
![API Gateway](https://img.shields.io/badge/API_Gateway-Cloud-6DB33F?style=flat-square&logo=spring&logoColor=white)

</div>

---

## 📁 Project Structure

```
Microservices/
│
├── 📘 BasicsMicroservices/             → Config Server, Eureka, API Gateway, Feign Client
├── 📦 MicroServicesProject/            → Eureka, API Gateway, Product & Order Services
├── 🐇 Rabbitmqpractice/               → RabbitMQ Producer & Consumer Practice
├── 💳 payment-service-microservices/   → Config Server, Eureka, Feign, User & Payment
└── 📚 Assignment-Online Book Ordering/ → RabbitMQ Event-Driven Book Ordering System
```

---

## 🗂️ Projects at a Glance

### 1️⃣ BasicsMicroservices

> Beginner-friendly microservices setup with **Config Server**, **Eureka**, **API Gateway**, and **Feign Client**.

**Services:** `configserver` · `service-registry` · `api-gateway` · `user-service` · `payment-service`

---

### 2️⃣ MicroServicesProject

> Full-stack microservices with **Eureka Service Registry**, **API Gateway**, and **Feign Client** for inter-service calls.

**Services:** `service-registry` · `api-gateway` · `product-service` · `order-service`

---

### 3️⃣ Rabbitmqpractice

> Hands-on practice with **RabbitMQ** messaging — a producer sends recharge requests, a consumer processes them.

**Services:** `recharge-service` (Producer) · `processing-service` (Consumer)

---

### 4️⃣ payment-service-microservices

> Advanced architecture with **Config Server**, **Service Registry**, **API Gateway**, and **Feign Client**.

**Services:** `config-server` · `service-registry` · `api-gateway` · `user-service` · `payment-service`

---

### 5️⃣ 📚 Assignment — Online Book Ordering Microservices

> **Case Study Assignment** — Two microservices communicating via **RabbitMQ** for an online book ordering system.

**Services:** `book-service` (Port 8081) · `order-service` (Port 8082)

#### 🔄 Messaging Flow
```
Client ──POST──▶ Order Service ──Publish──▶ RabbitMQ ──Consume──▶ Book Service
                 (saves order)              (bookQueue)          (reduces stock)
```
---

## 🛠️ Tech Stack

| Technology        | Purpose                          |
|-------------------|----------------------------------|
| ☕ Java 17        | Programming Language             |
| 🍃 Spring Boot    | Application Framework            |
| 📊 Spring Data JPA| Database ORM                     |
| 🐘 PostgreSQL     | Relational Database              |
| 🐇 RabbitMQ       | Message Broker                   |
| 📡 Eureka         | Service Discovery                |
| 🌐 Spring Cloud Gateway | API Gateway               |
| 🔗 OpenFeign      | Inter-Service Communication      |
| ⚙️ Config Server  | Centralized Configuration        |
| 🐳 Docker         | Containerization                 |
| 📮 Postman        | API Testing                      |

---

## 🚀 Getting Started

### Prerequisites
- ☕ Java 17+
- 🐘 PostgreSQL running on `localhost:5432`
- 🐇 RabbitMQ running on `localhost:5672` (Dashboard: `http://localhost:15672`)
- 📦 Maven (or use the included `mvnw` wrapper)

### Run Any Service
```bash
cd <service-folder>
./mvnw spring-boot:run
```

---

<div align="center">

**Made with ❤️ using Spring Boot, RabbitMQ & Microservices Architecture**

</div>
