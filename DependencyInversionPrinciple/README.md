# Dependency Inversion Principle - Notification Service

This project contains the implementation of the **Dependency Inversion Principle (DIP)** using a notification service example.  

The **Dependency Inversion Principle (DIP)** states that:
- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Abstractions should not depend on details. Details should depend on abstractions.

In this project:

- **High-level module**  → `Program` (controller)
- **Abstraction**        → `INotificationProvider` (interface)
- **Low-level modules**  → `EmailNotificationProvider`, `SMSNotificationProvider`, `PushNotificationProvider`

`Program` never directly creates or depends on a concrete provider.  
Instead, it uses the `INotificationProvider` interface and gets the actual provider through the `NotificationFactory`.

The project demonstrates how high-level modules depend on abstractions (`INotificationProvider`) rather than concrete implementations (SMS, Email, Push).


## Modules
- `notificationproviders` (library with notification provider interface and implementations)
- `controller` (console app to demonstrate usage)


## Structure

- **INotificationProvider**: An interface defining the contract for notification providers.  
- **Implementations**:
  - `EmailNotificationProvider`
  - `SMSNotificationProvider`
  - `PushNotificationProvider`
- **NotificationFactory**: Factory class to get the required provider at runtime.  
- **Program**: The console application entry point that uses the factory and interface to send notifications without being tightly coupled to specific implementations.

## UML Diagram
![UML Diagram of Dependency Inversion Principle](./DIP%20UML.jpg)

## Prerequisites
- Java 17+
- Apache Maven 3.8+

## Build
```bash
# From the repo root
mvn clean compile
```

### Running Checkstyle
```bash
# From the repo root
mvn checkstyle:check
```

### Running Unit Test
```bash
# From the repo root
mvn test
```

## Run
```bash
mvn -q exec:java
```

## Expected output (sample)
```
Sending notification via SMS Notification Provider
SMS Notification: Test message for notification service
```