package Model;

import java.util.Objects;

/**
 * Represents a to-do item with a description and a completion status.
 */
public class TodoItem {
    private String description;
    private boolean completed;

    /**
     * Constructs a new TodoItem with the specified description.
     * The item is marked as not completed by default.
     *
     * @param description The description of the to-do item.
     */
    public TodoItem(String description) {
        this.description = description;
        this.completed = false;
    }

    /**
     * Returns the description of this to-do item.
     *
     * @return The description of the to-do item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of this to-do item.
     *
     * @param description The new description of the to-do item.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns whether this to-do item is completed.
     *
     * @return {@code true} if the item is completed, {@code false} otherwise.
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Sets the completion status of this to-do item.
     *
     * @param completed {@code true} to mark the item as completed, {@code false} to mark it as not completed.
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Returns a string representation of this to-do item.
     * The string representation includes the description and the completion status.
     *
     * @return A string representation of this to-do item.
     */
    @Override
    public String toString() {
        return "TodoItem{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }

    /**
     * Compares this to-do item to the specified object. The result is {@code true}
     * if and only if the argument is not {@code null} and is a {@code TodoItem} object
     * that has the same description and completion status as this object.
     *
     * @param o The object to compare this {@code TodoItem} against.
     * @return {@code true} if the given object represents a {@code TodoItem} equivalent to this to-do item, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return completed == todoItem.completed && Objects.equals(description, todoItem.description);
    }

    /**
     * Returns a hash code value for this to-do item.
     * The hash code is based on the description and completion status.
     *
     * @return A hash code value for this to-do item.
     */
    @Override
    public int hashCode() {
        return Objects.hash(description, completed);
    }
}
