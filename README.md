Employee Management System

A full-stack Employee Management System developed to simplify employee administration, attendance tracking, and leave management. The application provides a centralized platform for managing employee information, maintaining attendance records, handling leave-related activities, and generating monthly attendance reports.

🚀 Features

👥 Employee Management

Employee registration and information management.

View and manage employee records.

Search, sort, and paginate employee details.

Role-based access for different users.

📅 Attendance Management

Record and track employee attendance.

Maintain daily attendance records.

Retrieve attendance information for reporting.

Generate monthly attendance summaries.

📝 Leave Management

Manage employee leave information.

Maintain leave records in the database.

Organize leave-related information for easier tracking.

📊 Monthly Reports

Generate monthly attendance reports.

Retrieve attendance information from the MySQL database.

Reduce manual effort involved in attendance reporting.

🔐 Authentication and Authorization

JWT-based authentication.

Secure login and protected routes.

Role-based access control:

ADMIN: Access to administrative operations.

USER: Read-only access to permitted information.

🛠️ Technology Stack

Technology

Purpose

Java 17

Backend programming

Spring Boot

Backend application development

Spring Security

Authentication and authorization

JWT

Secure token-based authentication

Spring Data JPA

Database interaction

Hibernate

ORM

MySQL

Relational database

React.js

Frontend development

Vite

Frontend build tool

Axios

API communication

React Router

Frontend navigation

CSS / Bootstrap

User interface styling

Maven

Backend dependency management

🏗️ System Architecture

The application follows a client-server architecture.

          React Frontend
                |
                | HTTP Requests (Axios)
                |
          Spring Boot Backend
                |
        Spring Security + JWT
                |
          REST API Controllers
                |
          Service Layer
                |
       Spring Data JPA / Hibernate
                |
             MySQL

🔄 Application Workflow

User Login: The user enters login credentials through the React application.

Authentication: Spring Security validates the credentials and JWT is used for authenticated requests.

Employee Management: Authorized users access employee information and management operations.

Attendance Tracking: Employee attendance records are maintained in the database.

Leave Management: Employee leave information is stored and managed.

Report Generation: Attendance data is retrieved to generate monthly reports.

Dashboard: The frontend displays the relevant employee and attendance information.

🗄️ Database

Database: MySQL

The database is used to maintain employee information, user credentials, attendance records, and leave-related information.

The following are conceptual entities for the application:

Entity

Purpose

Employee

Stores employee details

User

Stores login and role information

Attendance

Maintains employee attendance records

Leave

Maintains employee leave records
