package com.example.cab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
        public static Connection getConnection() throws SQLException {
            String jdbcUrl = "jdbc:mysql://localhost:3307/cab";;
            String driver = "com.mysql.cj.jdbc.Driver";
            String username = "root";
            String password = "";

            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            return DriverManager.getConnection(jdbcUrl, username, password);
        }
}
