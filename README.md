# Smart Courier Management System API

Backend platform for managing courier delivery operations with support for multiple user workflows, package tracking, delivery assignments, and simulated real-time delivery updates using scheduling and multithreading.

## Features

- Manage courier delivery workflow
- Support multiple user types:
  - Admin
  - Manager
  - Delivery Agent
  - Customer
- Order creation and package tracking
- Assign delivery tasks to agents
- Track delivery progress
- Real-time delivery status simulation using scheduler
- Parallel assignment of packages using multithreading
- Scalable relational database design
- RESTful API architecture

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST APIs
- Multithreading
- Scheduler (@Scheduled)
- Maven

## User Workflows

### Admin
- Manage users
- View system data

### Manager
- Assign packages to delivery agents
- Monitor delivery progress

### Delivery Agent
- View assigned deliveries
- Update delivery status

### Customer
- Place courier orders
- Track package status

## Core Modules

### User Module
- Manage user data
- Support different user workflows

### Order Module
- Create courier orders
- Store package information
- Track delivery progress

### Delivery Assignment Module
- Assign packages to delivery agents
- Maintain assignment timestamps
- Support multiple package assignments

### Tracking Module
- Track delivery progress
- Update package status

### Scheduler Module
- Periodically simulate real-time delivery updates
- Automate delivery progress changes

### Multithreading Module
- Parallel processing for bulk delivery assignments
- Improve performance when handling multiple packages

## Database Design (concept)

Tables:

users  
orders  
packages  
locations  
delivery_assignments  

Relationships:

- One order can contain multiple packages
- Delivery agents can be assigned multiple packages
- Delivery assignments maintain timestamps
- Locations track package movement

## API Endpoints (example)

POST /orders  
GET /orders  
GET /orders/{id}  

POST /packages  
GET /packages  
GET /packages/{id}  

POST /assignments  
GET /assignments  

PUT /packages/{id}/status  

GET /tracking/{packageId}

## Multithreading Use Cases

- Assign multiple packages to delivery agents in parallel
- Improve performance for bulk operations
- Simulate concurrent delivery updates

## Scheduler Workflow

System periodically updates delivery progress using scheduled tasks to simulate real-time courier tracking.

Example:
Package Status Flow:
ORDER_CREATED → ASSIGNED → IN_TRANSIT → OUT_FOR_DELIVERY → DELIVERED

## Future Improvements

- JWT authentication
- role-based access control
- live GPS tracking integration
- notification system (SMS/email)
- delivery analytics dashboard
- Docker deployment
