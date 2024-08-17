package View;

import Model.TodoItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class TodoListView {
    private ListView<TodoItem> listView;
    private ObservableList<TodoItem> todoItems;

    public TodoListView() {
        todoItems = FXCollections.observableArrayList();
        listView = new ListView<>(todoItems);
        listView.setCellFactory(param -> new TodoListCell());
    }

    public void addTodoItem(TodoItem item) {
        todoItems.add(item);
    }

    public void removeTodoItem(TodoItem item) {
        todoItems.remove(item);
    }

    public ListView<TodoItem> getListView() {
        return listView;
    }

    public ObservableList<TodoItem> getTodoItems() {
        return todoItems;
    }
}
