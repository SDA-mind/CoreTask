package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Tom", "Brook", (byte) 25);
        userService.saveUser("Bob", "Green", (byte) 30);
        userService.saveUser("Clara", "Banks", (byte) 20);
        userService.saveUser("Timmy", "White", (byte) 15);
        userService.getAllUsers();
        userService.removeUserById(2);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
