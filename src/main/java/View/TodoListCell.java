package View;

import Model.TodoItem;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 * The {@code TodoListCell} class is a custom ListCell used to render each {@link TodoItem}
 * in a {@link javafx.scene.control.ListView}. It displays the task description along with
 * a checkbox to mark the task as completed or not.
 */
public class TodoListCell extends ListCell<TodoItem> {
    private HBox hBox = new HBox();
    private CheckBox checkBox = new CheckBox();
    private Text description = new Text();

    /**
     * Constructs a new {@code TodoListCell} and initializes the UI components.
     * The cell includes a checkbox for marking the task as completed and a text
     * element for displaying the task description.
     */
    public TodoListCell() {
        super();

        // Apply BootstrapFX styling classes
        hBox.getStyleClass().add("d-flex");
        checkBox.getStyleClass().add("form-check-input");
        description.getStyleClass().add("ms-2");

        // Add checkbox and description text to the HBox
        hBox.getChildren().addAll(checkBox, description);

        // Handle the action when the checkbox is selected or deselected
        checkBox.setOnAction(e -> {
            TodoItem item = getItem();
            if (item != null) {
                item.setCompleted(checkBox.isSelected());
                updateItem(item, false);
            }
        });
    }

    /**
     * Updates the content of the cell to reflect the data in the {@link TodoItem}.
     * If the cell is empty or the {@link TodoItem} is null, the cell is cleared.
     * Otherwise, the description text and checkbox state are updated.
     *
     * @param todoItem The {@link TodoItem} instance associated with this cell.
     * @param empty    Whether or not this cell represents empty content.
     */
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
