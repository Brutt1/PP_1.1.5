package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/mynewtest", "root", "c1224680");
            System.out.println("подключение произведено");
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
