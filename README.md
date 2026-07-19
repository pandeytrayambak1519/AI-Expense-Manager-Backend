# 💰 AI Expense Manager - Backend

A backend REST API built using Spring Boot to manage personal expenses. The application allows users to manage expenses, categories, budgets, and scan receipts using OCR. Data is stored in PostgreSQL.

---

# 🚀 Features

- 👤 User Management
- 💰 Expense Management (CRUD)
- 📂 Category Management
- 📊 Budget Management
- 📷 OCR-based Receipt Scanner
- 🌐 REST APIs
- 🗄 PostgreSQL Database

---

# 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Tesseract OCR

---

# 📁 Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── dto
├── config
├── exception
└── util
```

---

# ⚙️ Getting Started

## 1. Clone the repository

```bash
git clone https://github.com/pandeytrayambak1519/AI-Expense-Manager-Backend.git
```

## 2. Navigate to the project

```bash
cd AI-Expense-Manager-Backend
```

## 3. Configure PostgreSQL

Create a PostgreSQL database and update your database credentials in:

```properties
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/expensemanager
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## 4. Run the project

```bash
mvn spring-boot:run
```

---

# 📌 Main Modules

- User Module
- Expense Module
- Category Module
- Budget Module
- OCR Receipt Scanner

---

# 🗄 Database

- PostgreSQL

---

# 📈 Future Improvements

- Spring Security
- JWT Authentication
- AI-based Expense Categorization
- Monthly Expense Analytics
- Email Notifications
- Export Reports (PDF/Excel)


## 🌐 Live Demo

- Frontend: https://ai-expense-manager-frontend.vercel.app/
- Backend API: https://ai-expense-manager-backend-1.onrender.com

---

## 🚀 Deployment

| Service | Platform |
|---------|----------|
| Frontend | Vercel |
| Backend | Render |
| Database | Neon PostgreSQL |

---

# 👨‍💻 Author

**Trayambak Pandey**

Java Full Stack Developer

GitHub: [pandeytrayambak1519](https://github.com/pandeytrayambak1519)
