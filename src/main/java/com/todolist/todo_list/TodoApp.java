package com.todolist.todo_list;

import Controller.TodoController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The {@code TodoApp} class is the main entry point for the To-Do List application.
 * It initializes the JavaFX application, sets up the primary stage, and displays the
 * main scene containing the to-do list interface.
 *
 * @author Aleko Khomasuridze
 * @date 2024-08-17
 */
public class TodoApp extends Application {

    /**
     * The {@code start} method is called when the JavaFX application starts.
     * It sets up the primary stage, creates the scene using the {@link TodoController},
     * and displays it.
     *
     * @param primaryStage The primary stage for this application.
     */
    @Override
    public void start(Stage primaryStage) {
        TodoController todoController = new TodoController();

        // Create a scene with the view from TodoController and set it on the primary stage
        Scene scene = new Scene(todoController.getView(), 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Todo List");
        primaryStage.show();
    }

    /**
     * The main method is the entry point of the application.
     * It launches the JavaFX application by calling {@code launch(args)}.
     *
     * @param args The command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
