package View;

import Model.TodoItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

/**
 * The {@code TodoListView} class represents the visual component for displaying a list of to-do items.
 * It manages the {@link ListView} and the underlying data model, allowing items to be added or removed
 * from the list.
 */
public class TodoListView {
    private ListView<TodoItem> listView;
    private ObservableList<TodoItem> todoItems;

    /**
     * Constructs a new {@code TodoListView} and initializes the list view and its data model.
     * The list view is set up with a custom cell factory for rendering each to-do item.
     */
    public TodoListView() {
        todoItems = FXCollections.observableArrayList();
        listView = new ListView<>(todoItems);
        listView.setCellFactory(param -> new TodoListCell());
    }

    /**
     * Adds a new to-do item to the list.
     *
     * @param item The {@link TodoItem} to be added to the list.
     */
    public void addTodoItem(TodoItem item) {
        todoItems.add(item);
    }

    /**
     * Removes a to-do item from the list.
     *
     * @param item The {@link TodoItem} to be removed from the list.
     */
    public void removeTodoItem(TodoItem item) {
        todoItems.remove(item);
    }

    /**
     * Returns the {@link ListView} containing the to-do items.
     * This method is used to retrieve the visual component for displaying the to-do items.
     *
     * @return The {@link ListView} containing the to-do items.
     */
    public ListView<TodoItem> getListView() {
        return listView;
    }

    /**
     * Returns the observable list of to-do items.
     * This method is used to retrieve the data model backing the list view.
     *
     * @return The {@link ObservableList} of {@link TodoItem} objects.
     */
    public ObservableList<TodoItem> getTodoItems() {
        return todoItems;
    }
}
