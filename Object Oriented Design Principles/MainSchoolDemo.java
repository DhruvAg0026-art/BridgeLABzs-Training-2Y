public class MainSchoolDemo {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("S001", "Alice");
        Student s2 = new Student("S002", "Bob");

        // aggregation: add students to school (students can exist independently)
        school.addStudent(s1);
        school.addStudent(s2);

        Course c1 = new Course("CSE101", "Intro to CS");
        Course c2 = new Course("MTH101", "Calculus I");

        // association: many-to-many via enrollments
        s1.enroll(c1);
        s1.enroll(c2);

        c2.enrollStudent(s2); // enroll via course

        // show results
        school.listStudents();
        System.out.println();
        s1.viewCourses();
        System.out.println();
        c2.listStudents();
    }
}