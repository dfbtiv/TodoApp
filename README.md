# 📝 Java CLI To-Do List App

A simple, interactive To-Do List application built with Java. This project was developed as a foundational portfolio piece to demonstrate core **Object-Oriented Programming (OOP)** principles.

## ✨ Features
- **Add Tasks:** Dynamically insert new tasks or to-do items.
- **View Tasks:** Display a formatted list of all tasks with their current status.
- **Complete Tasks:** Interactively mark tasks as done (changing from `[ ]` to `[x]`).
- **Input Validation:** Prevents the app from crashing when choosing empty lists or invalid task numbers.

## 🚀 Concepts & Technologies Used
- **Language:** Java
- **Core Concepts:** Object-Oriented Programming (Classes, Encapsulation, Constructors, and Methods).
- **Data Structures:** `ArrayList` for dynamic data storage.
- **User Interaction:** `Scanner` class for real-time console input.
- **Logic Flow:** Implementation of `while` loops, `for` loops, and complex `if-else` branching.

## 📂 Project Structure
- `Main.java`: The entry point and user interface logic.
- `TodoManager.java`: The "controller" that manages the task list logic.
- `Task.java`: The "blueprint" or data model for individual task objects.

## 🛠 Future Roadmap
- [ ] **Delete Feature:** Ability to remove specific tasks from the list.
- [ ] **GUI Version:** Migrating from CLI to a Graphical User Interface (Java Swing/JavaFX).
- [ ] **Data Persistence:** Saving tasks to a file or database so they don't disappear when the app closes.

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