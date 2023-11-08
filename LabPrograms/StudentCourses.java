/*create a class student get their name grade course. Then create method to add course and to remove course. Then check if course registered is more than 2 throw an exception */

import java.util.ArrayList;
import java.util.List;

public class StudentCourses {
    private String name;
    private String grade;
    private List<String> courses = new ArrayList<>();

    public StudentCourses(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addCourse(String course) {
        if (courses.size() < 3) {
            courses.add(course);
            System.out.println(name + " added course: " + course);
        } else {
            throw new IllegalArgumentException(name + " is already registered for 3 courses. Cannot add more.");
        }
    }

    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(name + " removed course: " + course);
        } else {
            System.out.println(name + " is not registered for the course: " + course);
        }
    }

    public static void main(String[] args) {
        StudentCourses student1 = new StudentCourses("Alice", "Grade 10");
        StudentCourses student2 = new StudentCourses("Bob", "Grade 11");

        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("History"); // This will throw an exception

        student2.addCourse("English");
        student2.addCourse("Art");
        student2.removeCourse("Art");

        student1.removeCourse("Science");

        // Adding one more course to student1 will throw an exception
        student1.addCourse("Geography");
        student1.addCourse("Civil");
    }
}
