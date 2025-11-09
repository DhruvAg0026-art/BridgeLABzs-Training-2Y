import java.util.ArrayList;
import java.util.List;

public class School {
    private final String name;
    private final List<Student> students = new ArrayList<>();

    public School(String name) { this.name = name; }

    public String getName() { return name; }

    // aggregation: school holds references to students (students can exist independently)
    public void addStudent(Student s) {
        if (s != null && !students.contains(s)) students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public List<Student> getStudents() { return new ArrayList<>(students); }

    public void listStudents() {
        System.out.println("School: " + name);
        if (students.isEmpty()) { System.out.println("  (no students)"); return; }
        for (Student s : students) System.out.println("  - " + s.getId() + " : " + s.getName());
    }
}
