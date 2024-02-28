package cn.techtutorial.ctb.connection;

import java.sql.*;

public class ConnectionDB {
    public static Connection getCon() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticket", "root", "NeverGiveUp@123");
    }
}
