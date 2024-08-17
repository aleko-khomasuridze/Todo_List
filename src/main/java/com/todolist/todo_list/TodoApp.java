package com.todolist.todo_list;

import Controller.TodoController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TodoApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        TodoController todoController = new TodoController();

        Scene scene = new Scene(todoController.getView(), 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Todo List");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
