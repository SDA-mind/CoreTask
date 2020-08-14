package jm.task.core.jdbc.util;

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
