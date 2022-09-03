package controllers;

import entity.Status;
import entity.Todo;
import repository.TodoRepository;

import javax.swing.*;
import java.sql.Date;
import java.sql.Time;

public class TodoController {

    private final TodoRepository todoRepository = new TodoRepository();

    public void addTodo() {

        try {

            Todo todo = this.collectTodoInfo();
            this.todoRepository.addTodoToDB(todo);
            System.out.println("Todo Added Successfully!");

        } catch (Exception exception) {
            System.out.println(exception.getClass() + " : " + exception.getMessage());
        }
        // collect todo info
        // add to do to DB
        //show success or failure messages
    }

    private Todo collectTodoInfo() {
        Todo todo = new Todo();
        todo.setDescription(this.getUserInput("description"));
        Date dueDate = Date.valueOf(this.getUserInput("Due date, Example 2022-09-03"));
        todo.setDueDate(dueDate);
        Time dueTime = Time.valueOf(this.getUserInput("Due time, Example 14:34") + ":00");
        todo.setDueTime(dueTime);
        todo.setStatus(Status.PENDING);

        return todo;
    }

    private String getUserInput(String message) {

        return JOptionPane.showInputDialog("Enter " + message);
    }
}
