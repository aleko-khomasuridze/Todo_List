
# To-Do List Application

This is a simple To-Do List application built using JavaFX and BootstrapFX for styling. The application allows users to add tasks, mark them as completed, and remove tasks from the list.

## Features

- **Add Tasks:** Users can add a new task by entering a description and clicking the "Add Task" button.
- **Mark as Completed:** Users can mark tasks as completed by checking the checkbox next to each task.
- **Remove Tasks:** Users can remove tasks from the list (Note: Removal feature should be implemented if not available).
- **BootstrapFX Styling:** The application uses BootstrapFX to give it a modern and professional appearance.

## Project Structure

The project is organized into the following packages and classes:

### 1. `Model`

- **`TodoItem.java`**
    - Represents a single to-do item with a description and a completion status.

### 2. `View`

- **`TodoListView.java`**
    - Manages the visual component for displaying the list of to-do items.
- **`TodoListCell.java`**
    - Custom `ListCell` used to render each `TodoItem` in the `ListView`.

### 3. `Controller`

- **`TodoController.java`**
    - Handles the user interactions and ties together the input field, add button, and the list view.

### 4. `Main`

- **`TodoApp.java`**
    - The main entry point of the application. It sets up the JavaFX application and displays the main scene.

## Requirements

- **Java 8 or higher**
- **JavaFX 8 or higher**
- **BootstrapFX** (included via Maven dependency)

## How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/todo-list-app.git
   cd todo-list-app
   ```

2. **Build the project:**
    - If you're using Maven, you can build the project with:
      ```bash
      mvn clean install
      ```

3. **Run the application:**
    - You can run the application by executing the `TodoApp` class:
      ```bash
      mvn exec:java -Dexec.mainClass="com.todolist.todo_list.TodoApp"
      ```

4. **Using the Application:**
    - Enter a task description in the input field and click "Add Task" to add a new task.
    - Mark tasks as completed by checking the checkbox next to each task.

## Contributing

Contributions are welcome! Please fork this repository and submit a pull request if you have any improvements or new features.

## Author

- **Aleko Khomasuridze** - *Initial work* - [My GitHub](https://github.com/aleko-khomasuridze)

## Acknowledgments

- **BootstrapFX** - For providing a beautiful JavaFX styling library.
- **JavaFX** - For providing a powerful framework for building cross-platform desktop applications.
