# Student Management System

A Java-based console application designed to manage student enrollments, search student records, and sort students alphabetically. Built as part of object-oriented programming coursework using structured packages, input validation, and proper JavaDoc documentation.

## Features

- **Add Student**: Enrolls new students with validated SLIIT Student IDs (`ITXXXXXXXX`) and capitalized names.
- **Display All Students**: Prints the list of all registered students.
- **Search Student by ID**: Searches for a student using their unique ID string.
- **Sort Students by Name**: Uses bubble sort to arrange students alphabetically by name.
- **Input Validation**: Prevents application crashes from non-numeric menu selections or invalid text entries.

## Project Structure

```text
├── models/
│   ├── Student.java           # Student entity class
│   └── Course.java            # Course entity class
├── services/
│   └── EnrollmentManager.java # Business logic for course enrollment
├── mainapp/
│   └── Main.java              # Console user interface and application execution
├── docs/                      # Generated JavaDoc HTML documentation
└── README.md                  # Project documentation and run instructions


## How to Compile and Run

Open your terminal in the project root directory.

Compile all source files across packages:
javac mainapp/Main.java models/*.java services/*.java

Run the Application:
java mainapp.Main

Generate JavaDoc documentation:
javadoc -d docs models/*.java services/*.java mainapp/*.java

##How to Use the Application

When you run the application, an interactive menu will display:

--- Student Management System ---
1. Add Student
2. Display All Students
3. Search Student by ID
4. Sort Students by Name
5. Exit
Choose an option: 
Option Details:

1. Add Student:
Enter Student ID in the format IT followed by 8 digits 
Enter Student Name starting with a capital letter 

2. Display All Students: Displays all registered student records.

3. Search Student by ID: Type the exact Student ID to search the database.

4. Sort Students by Name: Alphabetically reorders student entries.

5. Exit: Closes the program cleanly.
