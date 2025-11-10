# 💰 Expense Tracker – Spring Boot + Thymeleaf + MySQL

## 📌 Overview

The **Expense Tracker** is a Java-based web application built using **Spring Boot**, **Thymeleaf**, and **MySQL**.
It allows users to **add, edit, view, and delete** their daily expenses with categories and dates.
This project is ideal for learning full-stack **Spring MVC + CRUD + Database Integration**.

---

## 🚀 Features

* ➕ Add new expense
* 🖊️ Edit existing expenses
* ❌ Delete expenses
* 🗂️ Categorize by type (Food, Travel, Utilities, etc.)
* 🗕 Track date & amount
* 🧮 Responsive, clean Bootstrap UI
* 🔐 CSRF-protected forms (Spring Security-ready)
* ⚙️ Uses MySQL 8/9 + Hibernate ORM

---

## 🧡 Technologies Used

| Layer      | Technology                  |
| ---------- | --------------------------- |
| Backend    | Spring Boot 3.5.x           |
| Frontend   | Thymeleaf + Bootstrap 5     |
| Database   | MySQL 8.0 / 9.5             |
| ORM        | Hibernate (Spring Data JPA) |
| Build Tool | Maven                       |
| Language   | Java 21 / JDK 25 compatible |

---

## 🗂️ Project Structure

expense-tracker/
│
├── pom.xml
├── README.md
│
├── src/
│   └── main/
│       ├── java/com/example/expensetracker/
│       │   ├── ExpenseTrackerApplication.java
│       │   ├── controller/ExpenseController.java
│       │   ├── service/ExpenseService.java
│       │   ├── repository/ExpenseRepository.java
│       │   └── model/
│       │       ├── Expense.java
│       │       └── Category.java
│       │
│       └── resources/
│           ├── application.properties
│           └── templates/
│               ├── layout.html
│               ├── dashboard.html
│               ├── expenses.html
│               └── expense-form.html
│
└── target/

---

## ⚙️ Prerequisites

Before running this project, ensure you have:

| Tool                    | Version      | Description                       |
| ----------------------- | ------------ | --------------------------------- |
| Java JDK                | 21 or higher | Required for Spring Boot          |
| Maven                   | 3.9+         | For build & dependency management |
| MySQL Server            | 8.0 / 9.5    | Database                          |
| VS Code / IntelliJ IDEA | —            | Code editor                       |

---

## 🧩 Database Setup

1. **Open MySQL Command Line / Workbench**
   Run the following SQL:

   ```sql
   CREATE DATABASE IF NOT EXISTS expense_tracker CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

   CREATE USER IF NOT EXISTS 'expense_user'@'localhost' IDENTIFIED BY 'password123!';
   GRANT ALL PRIVILEGES ON expense_tracker.* TO 'expense_user'@'localhost';
   FLUSH PRIVILEGES;
   ```

2. **Update credentials** in
   `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
   spring.datasource.username=expense_user
   spring.datasource.password=password123!

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

   server.port=8089
   ```

---

## ▶️ Run the Project

### Using Maven

```bash
mvn clean spring-boot:run
```

Then open in browser:
👉 [http://localhost:8089/expenses](http://localhost:8089/expenses)

### Or build a JAR

```bash
mvn clean package -DskipTests
java -jar target/expense-tracker-1.0.0.jar
```

---

## 🦯 Demo Steps

1️⃣ Open **[http://localhost:8089/expenses](http://localhost:8089/expenses)**
2️⃣ Click **“Add Expense”**
3️⃣ Fill the form → Title, Amount, Category, Date → Save
4️⃣ View the list of all expenses
5️⃣ Click **Edit** to modify or **Delete** to remove an entry

---

## 🖼️ Screenshots

> 🧠 *Tip: Replace the below image links with your real screenshots (drag & drop in GitHub editor).*

### Dashboard

![Dashboard Screenshot](screenshots/dashboard.png)

### Add Expense Form

![Add Expense Screenshot](screenshots/add-expense.png)

### Expense List

![Expenses Screenshot](screenshots/expenses-list.png)

### Edit Expense

![Edit Expense Screenshot](screenshots/edit-expense.png)

---

## 🧠 Common Issues & Fixes

| Issue                            | Cause                          | Solution                                         |
| -------------------------------- | ------------------------------ | ------------------------------------------------ |
| **Port 8080 already in use**     | Another app is running         | Change `server.port=8089`                        |
| **Access denied for MySQL user** | Wrong credentials              | Reset password using `ALTER USER`                |
| **Whitelabel Error Page**        | Template missing or malformed  | Replace HTML with verified files                 |
| **CSRF Token error**             | Missing Spring Security config | Disable or include CSRF fields                   |
| **Cannot connect to DB**         | MySQL service stopped          | Run `net start mysql` or `systemctl start mysql` |

---

## 📚 Key Files

| File                     | Description                                  |
| ------------------------ | -------------------------------------------- |
| `ExpenseController.java` | Handles web routes (list, add, edit, delete) |
| `ExpenseService.java`    | Business logic layer                         |
| `ExpenseRepository.java` | JPA repository for DB operations             |
| `Expense.java`           | Entity mapped to `expenses` table            |
| `expense-form.html`      | Add/Edit expense form                        |
| `expenses.html`          | Expense list view                            |
| `layout.html`            | Common header/footer layout                  |

---

## 👨‍💻 Author

**👩‍💻 Bhagyesh Gajanan Magar**
🎓 B.Tech – Computer Science and Business Systems
🏫 JSPM’s Rajarshi Shahu College of Engineering, Pune
💼 Role: Developer | SEO Executive @ Precedence Research
🌍 Passionate about Digital Marketing, Web Development, and Data-driven Strategy

---

## 🪄 License

This project is open-source and free to use for **educational** or **personal** projects.
Feel free to modify, enhance, and redistribute with proper attribution.

---

### ❤️ Acknowledgements

Special thanks to:

* Spring Boot & Thymeleaf communities
* MySQL team for robust database support
* Bootstrap for the responsive frontend

---

### ⭐ Pro Tip

If you fork this on GitHub:

```bash
git add README.md
git commit -m "Added project documentation"
git push origin main
```

Then set the GitHub project description as:

> “Expense Tracker web app built with Spring Boot, Thymeleaf, and MySQL.”

---

### 🧾 Summary

✅ Fully working CRUD Expense Tracker
✅ Clean Thymeleaf UI
✅ Connected to MySQL 9.5
✅ Tested on Java 21 / JDK 25
✅ Ready for IntelliJ or VS Code

---
