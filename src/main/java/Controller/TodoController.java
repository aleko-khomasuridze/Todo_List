package Controller;

import Model.TodoItem;
import View.TodoListView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * The {@code TodoController} class is responsible for managing the user interface and interactions
 * for the to-do list application. It ties together the input field, add button, and the list view.
 */
public class TodoController {
    private VBox vBox;
    private TextField descriptionTextField;
    private Button addButton;
    private TodoListView todoListView;

    /**
     * Constructs a new {@code TodoController} and initializes the user interface components.
     * Sets up the input field for entering new tasks, the add button for adding tasks to the list,
     * and the list view for displaying the tasks.
     */
    public TodoController() {
        vBox = new VBox(10);
        descriptionTextField = new TextField();

        descriptionTextField.setPromptText("Enter a new Task Description");
        descriptionTextField.getStyleClass().add("form-control");

        addButton = new Button("Add Task");
        addButton.getStyleClass().addAll("btn", "btn-primary");

        todoListView = new TodoListView();

        // Add the new task to the list when the add button is clicked
        addButton.setOnAction(event -> {
            String description = descriptionTextField.getText();
            if (!description.isEmpty()) {
                todoListView.addTodoItem(new TodoItem(description));
                descriptionTextField.clear();
            }
        });

        vBox.getChildren().addAll(descriptionTextField, addButton, todoListView.getListView());
    }

    /**
     * Returns the root {@code VBox} containing all the UI components.
     * This method is used to retrieve the view for displaying in the JavaFX application.
     *
     * @return The root {@code VBox} containing the input field, add button, and list view.
     */
    public VBox getView() {
        return vBox;
    }
}
