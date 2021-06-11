package DatabaseLayer;

import java.sql.*;

public class CustomerDatabaseConnection {

    private String URL;
    private String UserName;
    private String Password;
    private static Connection dbConn;
    private static CustomerDatabaseConnection instance;

    private void InitializeDBSettings() {
        this.URL = "jdbc:mysql://127.0.0.01:3306/music_mart";
        this.UserName = "root";
        this.Password = "";
    }

    public static CustomerDatabaseConnection getSingleDatabaseConnection() {
        try {
            if (dbConn == null) {
                instance = new CustomerDatabaseConnection();
            } else if (dbConn.isClosed()) {
                instance = new CustomerDatabaseConnection();
            }
            return instance;
        } catch (SQLException ex) {
            return null;
        }
    }

    public CustomerDatabaseConnection() {
        try {
            InitializeDBSettings();
            Class.forName("com.mysql.cj.jdbc.Driver");//com.microsoft.sqlserver.jdbc.SQLServerDriver
            dbConn = DriverManager.getConnection(URL, UserName, Password);
            System.out.println("Hello");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Not Detected");
        } catch (SQLException ex) {
            System.out.println("Cannot connect to the Database " + ex.getErrorCode());
        }

    }

    public boolean ExecuteSQLQuery(String query) {
        try {
            Statement statement = dbConn.createStatement();
            int result = statement.executeUpdate(query);
            return result > 0;

        } catch (SQLException ex) {
            System.out.println("Cannot Execute Query " + ex.getErrorCode());
            return false;
        }

    }

}
