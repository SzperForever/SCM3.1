package com.jabil.test;

    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {
        private static Connection connection = null;
        //1.jdbc driver name
        private static String SQL_JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        // 2. Database URL, V_UDAY\FRAMEWORK is ServerName and JSF is DataBase name
        private static String URL = "jdbc:sqlserver://123.207.49.64:1433;database=ePlatform_Dev";
        //3.Database credentials
        private static String USERNAME = "sa";//UserName
        private static String PASSWORD = "Jabil456";//Password

        public static void main(String[] args) {
            getLocalConnection();
        }

        public static Connection getLocalConnection() {
            try {
                Class.forName(SQL_JDBC_DRIVER);// Register jdbc driver

                System.out.println("****Connect to Database****");

                //4. open a connection
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

                System.out.println("DataBase connect to: "+ connection.getMetaData().getDriverName());
                System.out.println("URL: "+ connection.getMetaData().getURL());

                setConnectionClose();
                System.out.println("Database Connection Closed");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Exception in getLocalConeection() "+e.getMessage());
            }
            return connection;
        }

        public static void setConnectionClose() throws SQLException {
            if (connection != null) {
                connection.close();
            }
        }

    }

