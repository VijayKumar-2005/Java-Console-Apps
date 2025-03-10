Project Title:  
Simple Java Student Management System

Description:  
This is a console-based Student Management System written in Java. It allows users to manage student records by providing functionalities to add, update, remove, and view student details. Each student is identified by a unique ID.

Features:  
- Add a new student with ID, name, age, and course  
- Update existing student information  
- Remove a student using their ID  
- View all student records or search for a specific student by ID  
- Menu-driven user interface with input validation

How It Works:  
1. The application displays a menu with options for different operations.
2. The user selects an option (1–5) to perform a desired action.
3. Student data is stored in a `HashMap<Integer, Student>` where the key is the student ID.
4. The application continues running until the user selects the "Exit" option.

How to Run:  
1. Compile the Java file using a terminal or command prompt:
   javac StudentManagementSystem.java

2. Run the compiled class:
   java StudentManagementSystem

Example Menu Output:
Student Management System  
1. Add Student  
2. Update Student  
3. Remove Student  
4. View Student Details  
5. Exit  
Enter your choice: 

Note:  
- Make sure to enter unique IDs for each student.  
- Updating or removing a student requires entering a valid ID.  
- Invalid inputs or actions will prompt error messages.

Author:  
Vijaykumar Pandian

License:  
This project is intended for educational use only. No warranties provided.
