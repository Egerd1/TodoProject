package controllers;

import javax.swing.*;

public class TodoMenuController {

    private final TodoController todoController = new TodoController();

    public void start(){
        this.showOptions();
        this.handleUserChoice();
    }

    private void showOptions(){
        System.out.println("Welcome to todo application" +
                "\n 1. Add todo item" +
                "\n 2. View todo list" +
                "\n 3. View  todo item" +
                "\n 4. Remove todo item" +
                "\n 5. Update todo item" +
                "\n 6. Exit" + "");
    }

    private void handleUserChoice(){
        String userChoice = JOptionPane.showInputDialog("Choose an option!");

        switch (userChoice){
            case "1":
                this.todoController.addTodo();
                break;
            case "2":
                // view todo list
                break;
            case "3":
                // view single item
                break;
            case "4":
                // remove todo item
                break;
            case "5":
                // update todo item
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("Choose an option from the list");
                break;
        }
        this.start();


        //-------------switch useing lambda--------------

//        switch (userChoice){
//            case "1" -> addTodo();
//            case "2" -> viewTodos();
//            case "3" -> viewTodo();
//            case "4" -> removeTodo();
//            case "5" -> updateTodo();
//            case "6" -> System.exit(0);
//        }
    }
}
