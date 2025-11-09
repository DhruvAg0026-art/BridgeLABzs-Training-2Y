import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String code;
    private final String title;
    private final List<Student> students = new ArrayList<>();

    public Course(String code, String title) { this.code = code; this.title = title; }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public List<Student> getStudents() { return new ArrayList<>(students); }

    // enroll student: updates both sides
    public void enrollStudent(Student s) {
        if (s == null) return;
        if (!students.contains(s)) {
            students.add(s);
            s.addCourseOnly(this); // update student side without recursion
        }
    }

    // package-private helper used by Student to avoid recursion
    void addStudentOnly(Student s) {
        if (s == null) return;
        if (!students.contains(s)) students.add(s);
    }

    public void listStudents() {
        System.out.println("Students in " + code + " - " + title + ":");
        if (students.isEmpty()) { System.out.println("  (no students)"); return; }
        for (Student s : students) System.out.println("  - " + s.getId() + " : " + s.getName());
    }
}