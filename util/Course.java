package util;

public class Course {
    private String course_id;
    private String course_name;
    private String Instructor;

    public Course(String course_id, String course_name, String Instructor) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.Instructor = Instructor;
    }

    public String getCourseName() {
        return course_name;
    }
}
