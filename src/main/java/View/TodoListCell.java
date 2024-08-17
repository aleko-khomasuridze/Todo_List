package View;

import Model.TodoItem;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.util.HashMap;

public class TodoListCell extends ListCell<TodoItem> {
    private HBox hBox = new HBox();
    private CheckBox checkBox = new CheckBox();
    private Text description = new Text();

    public TodoListCell() {
        super();

        hBox.getStyleClass().add("d-flex");
        checkBox.getStyleClass().add("form-check-input");
        description.getStyleClass().add("ms-2");

        hBox.getChildren().addAll(checkBox, description);
        checkBox.setOnAction(e -> {
            TodoItem item = getItem();
            if (item != null) {
                item.setCompleted(checkBox.isSelected());
                updateItem(item, false);
            }
        });
    }

    @Override
    protected void updateItem(TodoItem todoItem, boolean empty) {
        super.updateItem(todoItem, empty);
        if (empty || todoItem == null) {
            setText(null);
            setGraphic(null);
        } else {
            description.setText(todoItem.getDescription());
            checkBox.setSelected(todoItem.isCompleted());
            setGraphic(hBox);
        }
    }
}
