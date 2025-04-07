# 🧩 Microservices with Spring Boot

## ✅ What is Microservices Architecture?

Microservices is an architectural style where an application is structured as a collection of **small, loosely coupled, independently deployable services**. Each service is:
- Focused on a single business capability.
- Independently deployable.
- Has its own database (Database per service pattern).
- Communicates via APIs (mostly REST).

---

## 🔄 Microservices vs Monolithic

| Aspect             | Monolithic                              | Microservices                                  |
|--------------------|------------------------------------------|------------------------------------------------|
| Architecture       | Single large application                 | Collection of small services                   |
| Deployment         | One unit                                 | Independently deployable services              |
| Scaling            | Full app needs to scale                  | Scale only the required service                |
| Development Speed  | Slower (tight coupling)                  | Faster (independent modules)                   |
| Technology Stack   | Usually one                              | Can use different stacks per service           |

---

## 🧱 Key Components of Microservices

1. **Service Registry & Discovery** – Eg: Eureka
2. **API Gateway** – Central entry point (Eg: Spring Cloud Gateway, Zuul)
3. **Config Server** – Centralized config management
4. **Load Balancer** – Distributes traffic (Eg: Ribbon)
5. **Circuit Breaker** – Fault tolerance (Eg: Resilience4J/Hystrix)
6. **Distributed Tracing** – Debugging support across services
7. **Logging & Monitoring** – Eg: ELK Stack, Prometheus, Grafana

---

## 🛠️ How Spring Boot Helps in Microservices

- Spring Boot simplifies REST API development.
- Spring Cloud provides tools for distributed systems:
  - Eureka (Discovery)
  - Spring Cloud Gateway
  - Config Server
  - LoadBalancer, Sleuth, Zipkin

---

## 📂 Sample Microservices Architecture

```
User Service      --> user-db
Order Service     --> order-db
Payment Service   --> payment-db

Each service:
- Has its own controller, service, repo
- Communicates with other services via REST APIs
```

---

## 📦 Technologies Commonly Used

- **Spring Boot** – Core development
- **Spring Cloud** – For distributed system patterns
- **Netflix OSS** – Eureka, Zuul, Ribbon, Hystrix (legacy)
- **Docker & Kubernetes** – For containerization and orchestration
- **RabbitMQ / Kafka** – For asynchronous messaging

---

## 🔗 Communication Between Services

- **Synchronous**: Using `RestTemplate` / `WebClient` to call other services
- **Asynchronous**: Using messaging queues like Kafka/RabbitMQ

---

## ⚠️ Challenges in Microservices

- Complex distributed system
- Service discovery and coordination
- Managing configuration
- Inter-service communication
- Debugging and tracing
- Data consistency across services

---