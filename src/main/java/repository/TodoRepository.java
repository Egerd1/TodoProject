package repository;

import entity.Todo;

import java.sql.Connection;
import java.sql.SQLException;

public class TodoRepository {

    public void addTodoToDB(Todo todo) throws SQLException {
        Connection connection = DatabaseManager.getInstance().getConnection();
    }
}
