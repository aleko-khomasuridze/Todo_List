module com.todolist.todo_list {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.todolist.todo_list to javafx.fxml;
    exports com.todolist.todo_list;
}