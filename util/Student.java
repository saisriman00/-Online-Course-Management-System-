package util;

import java.util.*;

public class Student extends User {
    public Student(String id, String name, String email) {
        super(id, name, email);

    }

    private ArrayList<Course> Enrolledcourses = new ArrayList<>();

    public void enrolledCourse(Course course) {
        if (!Enrolledcourses.contains(course)) {
            Enrolledcourses.add(course);
            System.out.println("Enrolled in  " + course.getCourseName());
        }

    }

    @Override
    public void display() {

        // TODO Auto-generated method stub

    }

}
