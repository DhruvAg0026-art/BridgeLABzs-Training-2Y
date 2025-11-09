import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department d : departments) {
            if (d.getName().equals(deptName)) return d;
        }
        return null;
    }

    public void listStructure() {
        System.out.println("Company: " + name);
        if (departments == null || departments.isEmpty()) {
            System.out.println("  (no departments)");
            return;
        }
        for (Department d : departments) {
            System.out.println("  Dept: " + d.getName());
            d.listEmployees();
        }
    }

    // composition: shutting down company removes departments and employees
    public void shutdown() {
        if (departments != null) {
            for (Department d : departments) d.clearEmployees();
            departments.clear();
            departments = null;
        }
        System.out.println("Company " + name + " has been shut down; departments and employees removed.");
    }

    // Department is an inner class (cannot exist independently of Company)
    public class Department {
        private final String name;
        private List<Employee> employees = new ArrayList<>();

        private Department(String name) { this.name = name; }

        public String getName() { return name; }

        public void addEmployee(String empName, String position) {
            employees.add(new Employee(empName, position));
        }

        public void removeEmployee(String empName) {
            employees.removeIf(e -> e.getName().equals(empName));
        }

        public void listEmployees() {
            if (employees == null || employees.isEmpty()) {
                System.out.println("    (no employees)");
                return;
            }
            for (Employee e : employees) {
                System.out.println("    - " + e.getName() + " (" + e.getPosition() + ")");
            }
        }

        private void clearEmployees() {
            if (employees != null) {
                employees.clear();
                employees = null;
            }
        }

        // Employee defined inside Department (composition)
        public class Employee {
            private final String name;
            private final String position;

            private Employee(String name, String position) {
                this.name = name;
                this.position = position;
            }

            public String getName() { return name; }
            public String getPosition() { return position; }
        }
    }
}
