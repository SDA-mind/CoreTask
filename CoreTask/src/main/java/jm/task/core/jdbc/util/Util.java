package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection getMyConnection() throws SQLException {
        String hostName = "localhost";
        String dbName = "mydtb";
        String userName = "root";
        String password = "QNrwLztz21";

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useSSL=false";

        return DriverManager.getConnection(connectionURL, userName, password);
    }
}
