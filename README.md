
---

# Frontend README.md

````markdown
# Employee Management System - Frontend

## Overview

This project is the frontend component of the Employee Management System developed using React and TypeScript. The application provides a clean and responsive user interface that interacts with the Spring Boot backend to perform CRUD operations on employee records.

Users can create, view, update, and delete employees through an intuitive web interface.

---

## Technology Stack

- React 19
- TypeScript
- Vite
- Axios
- CSS3
- Node.js 20+

---

## Features

- Create Employee
- View Employee List
- Update Employee Details
- Delete Employee
- REST API Integration
- Responsive User Interface
- TypeScript-Based Development
- Axios HTTP Communication

---

## Project Structure

src
├── components
│ ├── EmployeeList.tsx
│ ├── EmployeeForm.tsx
│ └── EmployeeCreate.tsx
│
├── services
│ └── employeeApi.ts
│
├── App.tsx
└── main.tsx

---

## Backend Dependency

Ensure the Spring Boot backend is running before starting the React application.

Backend URL:

```text
http://localhost:8080
