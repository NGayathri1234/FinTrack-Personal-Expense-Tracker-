# FinTrack – Personal Expense Tracker

## Project Overview
FinTrack is a full-stack web-based personal expense tracking application developed using Java Spring Boot. The application enables users to record daily expenses, categorize transactions, and monitor total spending in real time through a clean and responsive dashboard.

The project was developed as part of an NLP and Software Internship to demonstrate skills in full-stack Java development, database integration, and responsive UI/UX design.

---

## Live Demo
🔗 Live Application: https://fintrack-personal-expense-tracker-1-fp4w.onrender.com

---

## Features

### Real-Time Expense Dashboard
- Displays all transactions dynamically
- Shows total amount spent instantly
- Responsive and user-friendly interface

### Expense Management
- Add expenses with:
  - Description
  - Category
  - Amount
  - Date

### Automated Total Calculation
- Uses Java Streams API for dynamic expense summation

### Categorization System
- Expenses grouped using Bootstrap badges:
  - Food
  - Travel
  - Bills
  - Shopping
  - Others

### Persistent Storage
- Data stored using MySQL/H2 Database with Spring Data JPA

### Responsive UI
- Developed using Bootstrap 5 for desktop and mobile compatibility

---

## Tech Stack

### Backend
- Java
- Spring Boot 4.0.6
- Spring Data JPA

### Frontend
- HTML5
- CSS3
- Bootstrap 5.3
- Thymeleaf

### Database
- MySQL / H2 Database

### Build Tool
- Maven

### IDE
- NetBeans

### Deployment
- Docker
- Render

---

## Project Architecture

The application follows the MVC (Model-View-Controller) architecture.

### Model
`Expense.java`
- Defines expense entity structure
- Includes:
  - description
  - category
  - amount
  - dateAdded

### Controller
`ExpenseController.java`
- Handles user requests
- Routes:
  - `GET /`
  - `POST /add`

### View
`dashboard.html`
- Displays dashboard UI
- Contains:
  - expense form
  - transaction table
  - total expense card

---

## Folder Structure

```bash
FinTrack/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   ├── resources/
│   │   └── templates/
│
├── pom.xml
├── Dockerfile
└── README.md
```

---

## Installation & Setup

### Clone Repository

```bash
git clone https://github.com/your-username/FinTrack-Personal-Expense-Tracker.git
```

### Navigate to Project

```bash
cd FinTrack-Personal-Expense-Tracker
```

### Run Application

Using Maven:

```bash
mvn spring-boot:run
```

OR

```bash
mvn clean install
java -jar target/fintrack-0.0.1-SNAPSHOT.jar
```

---

## Access Application

Open browser:

```bash
http://localhost:8080
```

---

## Database Configuration

Example MySQL Configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3307/expense_tracker
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

For deployment, H2 Database was used for simplified cloud hosting compatibility.

---

## Future Enhancements

- Advanced data visualization using Chart.js
- Monthly spending analytics
- Spring Security authentication
- JWT-based login system
- Budget alerts and notifications
- NLP-based expense parsing
- CSV/PDF export functionality
- Multi-user support

---

## Learning Outcomes

This project helped in gaining practical experience in:

- Spring Boot development
- MVC architecture
- RESTful request handling
- Database connectivity using JPA
- Responsive UI development
- Docker deployment
- Cloud hosting using Render
- Real-time data processing

---

## Project Impact

FinTrack demonstrates the ability to build scalable, data-driven financial applications using enterprise Java technologies. The project highlights backend integration, responsive frontend design, database persistence, and deployment workflows in a real-world development environment.

---

## Conclusion

FinTrack is a modern full-stack Java application designed for efficient personal expense management. By combining Spring Boot, Thymeleaf, Bootstrap, and database persistence, the project delivers a seamless and interactive financial tracking experience.

The project serves as a strong demonstration of:
- Full-stack Java development
- Database management
- MVC architecture
- UI/UX implementation
- Cloud deployment practices



