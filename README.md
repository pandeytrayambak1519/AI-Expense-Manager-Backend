# 💰 AI Expense Manager - Backend

A robust **Spring Boot REST API** for managing personal expenses, budgets, and receipt scanning using **OCR**. The backend provides secure APIs for expense tracking, category management, budget planning, and AI-powered receipt data extraction with PostgreSQL as the primary database.

---

## 🚀 Features

- 👤 User Profile Management
- 💸 Expense Management (CRUD)
- 📂 Category Management
- 📊 Budget Planning & Tracking
- 🧾 OCR-Based Receipt Scanner
- 🤖 AI-Powered Expense Analysis
- 🌐 RESTful API Architecture
- ⚡ Global Exception Handling
- ✅ Request Validation
- 🗄 PostgreSQL Database Integration
- ☁️ Cloud Deployment (Render + Neon)

---

## 🛠️ Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

### Database
- PostgreSQL
- Neon PostgreSQL

### OCR & AI
- Tesseract OCR

### Deployment
- Render
- GitHub

### Tools
- Postman
- IntelliJ IDEA
- VS Code
- Git
- GitHub

---

## 📂 Project Structure

```text
src/
├── controller/
├── service/
├── repository/
├── entity/
├── dto/
├── security/
├── config/
├── exception/
├── util/
└── resources/
```

---

## 🌐 Live Demo

### 🚀 Frontend
https://ai-expense-manager-frontend.vercel.app/

### ⚙️ Backend API
https://ai-expense-manager-backend-1.onrender.com

### 🗄 Database
Neon PostgreSQL

---

## 📡 API Modules

- 👤 User APIs
- 💰 Expense APIs
- 📂 Category APIs
- 📊 Budget APIs
- 🧾 OCR Receipt Scanner APIs

---

## 🌐 Sample API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | User login |
| GET | `/api/expenses` | Get all expenses |
| POST | `/api/expenses` | Add a new expense |
| PUT | `/api/expenses/{id}` | Update an expense |
| DELETE | `/api/expenses/{id}` | Delete an expense |
| POST | `/api/receipt/upload` | Upload receipt for OCR |
| GET | `/api/budget` | Get budget details |

---

## 🗄 Database

- PostgreSQL
- Neon Cloud Database

---

## ⚙️ Environment Variables

Configure your `application.properties` or environment variables.

```properties
SPRING_DATASOURCE_URL=

SPRING_DATASOURCE_USERNAME=

SPRING_DATASOURCE_PASSWORD=

JWT_SECRET=

TESSERACT_PATH=
```

---

## 🚀 Getting Started

### 1️⃣ Clone Repository

```bash
git clone https://github.com/pandeytrayambak1519/AI-Expense-Manager-Backend.git
```

### 2️⃣ Navigate to Project

```bash
cd AI-Expense-Manager-Backend
```

### 3️⃣ Install Dependencies

```bash
mvn clean install
```

### 4️⃣ Run Application

```bash
mvn spring-boot:run
```

---

## 🏗 Architecture

```text
React Frontend
       │
     Axios
       │
Spring Boot REST API
       │
Spring Data JPA
       │
 PostgreSQL (Neon)
```

---

## ☁️ Deployment

| Service | Platform |
|---------|----------|
| Frontend | Vercel |
| Backend | Render |
| Database | Neon PostgreSQL |

---

## 🔮 Future Enhancements

- 🔐 Two-Factor Authentication (2FA)
- 📧 Email Verification
- 🤖 AI-Based Expense Categorization
- 📈 Advanced Expense Analytics
- 📄 PDF & Excel Report Export
- 🐳 Docker Support
- ⚡ Redis Caching
- 📊 Admin Dashboard
- 🔔 Push Notifications

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push the branch
5. Open a Pull Request

---

## 👨‍💻 Author

**Trayambak Pandey**

Java Full Stack Developer

- GitHub: https://github.com/pandeytrayambak1519

---

## ⭐ Support

If you found this project useful, please consider giving it a ⭐ on GitHub.
