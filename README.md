# Student Management Dashboard

Student Management Dashboard is a desktop application built using JavaFX for the user interface and MySQL for persistent data storage. It enables educational institutions to easily add, view, and manage student details through a clean and responsive dashboard.

This system updates student data in real-time, validates input fields before submission, and organizes information in a structured table format for easy review.



## ✨ Features


✅ Student Data Display


Displays student details in a table view, including:

Name

Email

Course

Date & Time of Entry


✅ Add New Students


A simple form allows users to insert new student information.
The system automatically stores the current date and time.


✅ MySQL Database Integration


A dedicated DataStore class manages:

Inserting student records

Fetching existing data

Real-time updating of the table view


✅ Input Validation


Prevents addition if any field is empty and notifies the user via alert popups.


✅ Real-Time Updates

Once a student is added, the table refreshes instantly without restarting the application.



## 🛠️ How It Works

The application loads the FXML Dashboard UI at startup.

DashboardController initializes all components, binds table columns, and loads student data from MySQL.

Users can add new students via a simple form.

Valid data is:

Stored in the MySQL database

Immediately displayed on the dashboard



## 🧩 Tech Stack

### Frontend:

-JavaFX

-FXML

-Scene Builder

### Backend :

-Java (OOP)

-JDBC (Java Database Connectivity)

### Database :

-MySQL

### Tools & IDE :

-IntelliJ IDEA / Eclipse

-Scene Builder

-MySQL Workbench

### Build System :

-Maven / Gradle (optional)
