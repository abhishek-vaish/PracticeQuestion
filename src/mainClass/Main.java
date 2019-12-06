package mainClass;

import courseConnection.CourseConnection;
import tableCreattion.CreateCreation;

public class Main {
    public static void main(String[] args) {
        CourseConnection courseConnection = new CourseConnection();
        CreateCreation createCreation = new CreateCreation();
        courseConnection.createConnection();
        createCreation.createTable(courseConnection.getConnection());
    }
}
