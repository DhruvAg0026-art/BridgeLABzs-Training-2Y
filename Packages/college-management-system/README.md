# College Management System

## Overview
The College Management System is a Java application designed to manage student, faculty, and department information in a college. It provides functionalities to add, retrieve, and display details about students, faculty members, and departments.

## Features
- Manage student information (add, retrieve, display)
- Manage faculty information (add, retrieve, display)
- Manage department information (add, retrieve, display)
- Database connection utility for data persistence

## Project Structure
```
college-management-system
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── college
│   │               ├── main
│   │               │   └── CollegeManagementSystem.java
│   │               ├── student
│   │               │   ├── Student.java
│   │               │   └── StudentManager.java
│   │               ├── faculty
│   │               │   ├── Faculty.java
│   │               │   └── FacultyManager.java
│   │               ├── department
│   │               │   ├── Department.java
│   │               │   └── DepartmentManager.java
│   │               └── utils
│   │                   └── DatabaseConnection.java
│   └── test
│       └── java
│           └── com
│               └── college
│                   ├── student
│                   ├── faculty
│                   └── department
├── pom.xml
└── README.md
```

## Setup Instructions
1. Clone the repository.
2. Navigate to the project directory.
3. Use Maven to build the project:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn exec:java -Dexec.mainClass="com.college.main.CollegeManagementSystem"
   ```

## Usage
- Follow the prompts in the console to manage college information.
- Ensure that the database connection details are configured in the `DatabaseConnection.java` file.

## License
This project is licensed under the MIT License.