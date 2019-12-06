package courseUpdate;

import java.util.Scanner;

public class CourseUpdate {
        Scanner scanner = new Scanner(System.in);
        public int getCourseId (){
            int courseId = scanner.nextInt();
            return courseId;
        }

        String courseName = scanner.nextLine();
        String courseCode = scanner.nextLine();
        int courseDuration = scanner.nextInt();
        double courseCost = scanner.nextDouble();
}
