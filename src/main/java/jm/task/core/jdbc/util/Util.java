package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static Connection getConnection() {
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "1234");
            System.out.println("подключение произведено");
            return connection;
        } catch (SQLException e) {
            System.out.println("Ошибка при подключении");
            throw new RuntimeException(e);
        }
    }
}
