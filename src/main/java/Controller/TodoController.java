package Controller;

import Model.TodoItem;
import View.TodoListView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import org.kordamp.bootstrapfx.BootstrapFX;

public class TodoController {
    private VBox vBox;
    private TextField descriptionTextField;
    private Button addButton;
    private TodoListView todoListView;

    public TodoController() {
        vBox = new VBox();
        descriptionTextField = new TextField();
        descriptionTextField.setPromptText("Enter a new Task Description");
        descriptionTextField.getStyleClass().add("form-control");
        addButton = new Button("Add Task");
        addButton.getStyleClass().addAll("btn", "btn-primary");
        todoListView = new TodoListView();

        addButton.setOnAction(event -> {
           String description = descriptionTextField.getText();
           if (!description.isEmpty()) {
               todoListView.addTodoItem(new TodoItem(description));
               descriptionTextField.clear();
           }
        });

        vBox.getChildren().addAll(descriptionTextField, addButton, todoListView.getListView());
    }

    public VBox getView() {
        return vBox;
    }
}
