package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            UserService userService = new UserServiceImpl();
            userService.createUsersTable();
            userService.saveUser("Tom", "Brook", (byte) 25);
            userService.saveUser("Bob", "Green", (byte) 30);
            userService.saveUser("Clara", "Banks", (byte) 20);
            userService.saveUser("Kent", "White", (byte) 15);
            userService.removeUserById(2);
            userService.getAllUsers();
            userService.cleanUsersTable();
            userService.dropUsersTable();
        } catch (SQLException e) {

        }
    }
}
