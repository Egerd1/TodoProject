package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private static final DatabaseManager databaseManager_instance = new DatabaseManager();
    private Connection connection;

    public static DatabaseManager getInstance() {
        return databaseManager_instance;
    }

    private void setupDBConnection() {
        String host = "jdbc:mysql://localhost";
        String port = "3306";
        String databaseName = "jree17_todo_list";
        String password = "MinuSqlParool2022";
        String username = "root";

        String connectionUrl = host + ":" + port + "/" + databaseName + "?serverTimezone=UTC";

        try {
            this.connection = DriverManager.getConnection(connectionUrl, username, password);
        } catch (SQLException exception) {
            System.out.println("Unable to connect to database!");
            exception.printStackTrace();
        }
    }


    //---------------Kuidas teha õigesti-------------

    public Connection getConnection() throws SQLException{
        if (this.connection == null || this.connection.isClosed()){
            this.setupDBConnection();
        }
        return connection;
    }
}
