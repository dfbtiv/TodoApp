# 📝 Java CLI To-Do List App

A simple, interactive To-Do List application built with Java. This project was developed as a foundational portfolio piece to demonstrate core **Object-Oriented Programming (OOP)** principles.

## ✨ Features
- **Add Tasks:** Dynamically insert new tasks or to-do items.
- **View Tasks:** Display a formatted list of all tasks with their current status.
- **Complete Tasks:** Interactively mark tasks as done (changing from `[ ]` to `[x]`).
- **Delete Tasks:** Remove specific tasks from the list by their index.
- **Robust Input Validation:** Uses `try-catch` blocks to prevent the app from crashing when users enter invalid inputs (e.g., entering letters instead of numbers).

## 🚀 Concepts & Technologies Used
- **Language:** Java
- **Core Concepts:** Object-Oriented Programming (Classes, Encapsulation, Constructors, and Methods).
- **Exception Handling:** Implemented `try-catch` to handle `InputMismatchException`.
- **Data Structures:** `ArrayList` for dynamic data storage.
- **User Interaction:** `Scanner` class for real-time console input.
- **Logic Flow:** Implementation of `while` loops, `for` loops, and complex `if-else` branching.

## 📂 Project Structure
- `Main.java`: The entry point, user interface logic, and input validation.
- `TodoManager.java`: The "controller" that manages the logic for adding, viewing, and deleting tasks.
- `Task.java`: The data model for individual task objects.

## 🛠 Future Roadmap
- [x] **Delete Feature:** (Completed) Ability to remove specific tasks.
- [ ] **Data Persistence:** Saving tasks to a file (.txt or .json) or database so they don't disappear when the app closes.
- [ ] **GUI Version:** Migrating from CLI to a Graphical User Interface (Java Swing/JavaFX).
- [ ] **REST API Integration:** Transitioning this logic into a Spring Boot backend.

## 💻 How to Run
1. Ensure you have the **Java Development Kit (JDK)** installed.
2. Clone this repository:
   ```bash
   git clone [https://github.com/dfbtiv/TodoApp.git](https://github.com/dfbtiv/TodoApp.git)
3. Navigate to the project folder and compile the files:
```bash
   javac *.java
```
4. Run the application
 ```bash
 java Main