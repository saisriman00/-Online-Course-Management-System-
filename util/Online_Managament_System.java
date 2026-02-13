package util;

import java.util.*;

public class Online_Managament_System {
    private static ArrayList<Course> courses = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("101", "sarath", "sarath@gmail.com");
        while (true) {
            System.out.println("1.Add Course \n2.Register Student\n3.Enroll Student\n4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter course id");
                    String id = sc.nextLine();
                    System.out.print("Enter course name");
                    String name = sc.nextLine();
                    System.out.print("Enter Instructor name");
                    String Instructor = sc.nextLine();
                    Course course = admin.createCourse(id, name, Instructor);
                    courses.add(course);
                    break;
                case 2:
                    System.out.print("enter student id");
                    String sid = sc.nextLine();
                    System.out.print("enter student name");
                    String sname = sc.nextLine();
                    System.out.print("enter student email");
                    String email = sc.nextLine();
                    Student student = new Student(sid, sname, email);
                    students.add(student);
                    break;
                case 3:
                    System.out.print("Enter student Id");
                    String studentid = sc.nextLine();
                    Student selectedstudent = students.stream().filter(s -> s.id.equals(studentid)).findFirst()
                            .orElse(null);
                    if (selectedstudent == null) {
                        System.out.print("Student not found");
                        break;

                    }
                    System.out.println("Avalable courses");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println((i + 1) + ". " + courses.get(i).getCourseName());

                    }
                    System.out.println("Slect course member to enroll");
                    int coursesindex = sc.nextInt() - 1;
                    if (coursesindex >= 0 && coursesindex < courses.size()) {
                        selectedstudent.enrolledCourse(courses.get(coursesindex));
                    }
                    break;
                case 4:
                    System.out.print("Exiting");
                    return;

            }
        }

        // TODO Auto-generated method stub

    }

}
