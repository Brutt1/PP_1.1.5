package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {
//    private final Connection connection = Util.getConnection();
//
//    public UserDaoJDBCImpl() {
//
//    }
//
//    @Override
//    public void createUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users " +
//                    "(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), last_name VARCHAR(50), age TINYINT)");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public void dropUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("DROP TABLE IF EXISTS users");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public void saveUser(String name, String lastName, byte age) {
//        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name, last_name, age) VALUES (?, ?, ?)")) {
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//            System.out.println("User с именем - " + name + " добавлен в базу данных");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public void removeUserById(long id) {
//        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        List<User> userArrayList = new ArrayList<>();
//        try (ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM users");) {
//            while (resultSet.next()) {
//                User user = new User(resultSet.getString("name"), resultSet.getString("last_name"), resultSet.getByte("age"));
//                user.setId(resultSet.getLong("id"));
//                userArrayList.add(user);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(userArrayList);
//        return userArrayList;
//    }
//
//    @Override
//    public void cleanUsersTable() {
//        try (Statement statement = connection.createStatement()) {
//            statement.executeUpdate("TRUNCATE TABLE users");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
