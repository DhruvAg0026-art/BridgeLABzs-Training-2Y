import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class University {
    private final String name;
    private List<Department> departments = new ArrayList<>(); // composition
    private List<Faculty> facultyMembers = new ArrayList<>(); // aggregation

    public University(String name) { this.name = name; }

    // composition: create Department inside University
    public Department addDepartment(String deptName) {
        Department d = new Department(deptName);
        departments.add(d);
        return d;
    }

    public Department getDepartment(String deptName) {
        for (Department d : departments) if (d.getName().equals(deptName)) return d;
        return null;
    }

    // aggregation: add/remove faculty references (faculty can exist independently)
    public void addFaculty(Faculty f) {
        if (f != null && !facultyMembers.contains(f)) facultyMembers.add(f);
    }

    public void removeFaculty(Faculty f) { facultyMembers.remove(f); }

    public List<Faculty> getFacultyMembers() { return new ArrayList<>(facultyMembers); }

    public void listStructure() {
        System.out.println("University: " + name);
        System.out.println(" Faculties (aggregation):");
        if (facultyMembers.isEmpty()) System.out.println("  (no faculty)");
        else for (Faculty f : facultyMembers) System.out.println("  - " + f.getId() + " : " + f.getName());

        System.out.println(" Departments (composition):");
        if (departments == null || departments.isEmpty()) {
            System.out.println("  (no departments)");
            return;
        }
        for (Department d : departments) {
            System.out.println("  Dept: " + d.getName());
            d.listAssignedFaculty();
        }
    }

    // composition: shutdown removes all departments and their internal lists
    public void shutdown() {
        if (departments != null) {
            for (Department d : departments) d.clearAssignedFaculty();
            departments.clear();
            departments = null; // remove references so departments are eligible for GC
        }
        System.out.println("University " + name + " shut down; departments removed (composition).");
    }

    // Department defined as inner class -> cannot exist without University
    public class Department {
        private final String name;
        private List<Faculty> assignedFaculty = new ArrayList<>();

        private Department(String name) { this.name = name; }

        public String getName() { return name; }

        // assign existing Faculty (aggregation) to this Department
        public void assignFaculty(Faculty f) {
            if (f == null) return;
            if (!assignedFaculty.contains(f)) {
                assignedFaculty.add(f);
                // note: faculty object itself is independent
            }
        }

        public void removeFaculty(Faculty f) { assignedFaculty.remove(f); }

        public void listAssignedFaculty() {
            if (assignedFaculty == null || assignedFaculty.isEmpty()) {
                System.out.println("    (no assigned faculty)");
                return;
            }
            for (Faculty f : assignedFaculty) System.out.println("    - " + f.getId() + " : " + f.getName());
        }

        private void clearAssignedFaculty() {
            if (assignedFaculty != null) {
                assignedFaculty.clear();
                assignedFaculty = null;
            }
        }
    }
}