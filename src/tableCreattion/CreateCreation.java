package tableCreattion;

import courseUpdate.CourseUpdate;

import java.sql.*;

public class CreateCreation {
    public ResultSet createTable(Connection connection){
        CourseUpdate courseUpdate = new CourseUpdate();
        ResultSet resultSet = null;
        String Query = "CREATE TABLE COURSE (courseID INT, courseName VARCHAR(20), courseCode VARCHAR(20), courseDuration INT, courseCost DOUBLE);";
        /*String Query2 = "INSERT INTO COURSE VALUES (1, 'OBJECT-ORIENTED PROGRAMMING', 'BCSC0002', 4, 9562.50);";
        String Query3 = "INSERT INTO COURSE VALUES (2, 'OBJECT-ORIENTED PROGRAMMING LAB', 'BCSC0801', 4, 9562.50);";
        String Query4 = "INSERT INTO COURSE VALUES (?, ?, ?, ?, ?);";*/
        try{
            /*PreparedStatement statement = connection.prepareStatement(Query4);
            statement.setString(1, co*/
            Statement statement = connection.prepareStatement(Query);

            statement.executeUpdate(Query);
            //statement.executeUpdate(Query2);
            //statement.executeUpdate(Query3);
            //statement.executeUpdate(Query4);
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return resultSet;
    }
}
