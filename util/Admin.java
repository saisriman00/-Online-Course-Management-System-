package util;

public class Admin extends User {
    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    public Course createCourse(String course_id, String course_name, String Instructor) {
        return new Course(course_id, course_name, Instructor);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

}
