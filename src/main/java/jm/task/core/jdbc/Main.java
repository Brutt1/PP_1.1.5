package jm.task.core.jdbc;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        final UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 22);
        userService.saveUser("Андрей", "федотов", (byte) 18);
        userService.saveUser("Артур", "Пирожков", (byte) 55);
        userService.saveUser("Кларк", "Кент", (byte) 30);

        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}