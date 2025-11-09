import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String id;
    private final String name;
    private final List<Course> courses = new ArrayList<>();

    public Student(String id, String name) { this.id = id; this.name = name; }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<Course> getCourses() { return new ArrayList<>(courses); }

    // enroll: association (many-to-many). This method updates both sides.
    public void enroll(Course c) {
        if (c == null) return;
        if (!courses.contains(c)) {
            courses.add(c);
            c.addStudentOnly(this); // update course side without recursion
        }
    }

    // package-private helper used by Course to avoid recursion
    void addCourseOnly(Course c) {
        if (c == null) return;
        if (!courses.contains(c)) courses.add(c);
    }

    public void viewCourses() {
        System.out.println("Courses for " + name + " (" + id + "):");
        if (courses.isEmpty()) { System.out.println("  (no courses)"); return; }
        for (Course c : courses) System.out.println("  - " + c.getCode() + " : " + c.getTitle());
    }
}