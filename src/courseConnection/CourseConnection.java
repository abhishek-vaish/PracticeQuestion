package courseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CourseConnection {
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    public static final String URL = "jdbc:mysql://localhost:3306/praticequestion";
    Connection connection = null;

    public Connection getConnection(){
        return connection;
    }

    public boolean connectionClosed(){
        boolean connectionClosed = false;
        if(getConnection() != null){
            try {
                connection.close();
                connectionClosed = true;
            }
            catch (SQLException e){
                System.out.println("SQL Exception Occurred!!!");
            }
        }
        return connectionClosed;
    }

    public boolean createConnection(){
        boolean createConnection = false;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection Successfully Created!!!");
            createConnection = true;
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return createConnection;
    }
}
