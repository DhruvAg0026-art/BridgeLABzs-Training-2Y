import java.util.ArrayList;
import java.util.List;

public class Patient {
    private final String id;
    private final String name;
    private final List<Doctor> doctors = new ArrayList<>();

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<Doctor> getDoctors() { return new ArrayList<>(doctors); }

    // patient consults a doctor (association). This updates both sides.
    public void consult(Doctor d, String notes) {
        if (d == null) return;
        if (!doctors.contains(d)) {
            doctors.add(d);
            d.addPatientOnly(this);
        }
        System.out.printf("Patient %s consulted Dr. %s (%s) — Reason/Notes: %s%n",
                name, d.getName(), d.getSpecialty(), notes == null ? "(no notes)" : notes);
    }

    // helper used by Doctor to avoid recursion
    void addDoctorOnly(Doctor d) {
        if (d == null) return;
        if (!doctors.contains(d)) doctors.add(d);
    }

    public void listDoctors() {
        System.out.println("Doctors for patient " + name + ":");
        if (doctors.isEmpty()) { System.out.println("  (none)"); return; }
        for (Doctor d : doctors) System.out.println("  - " + d.getId() + " : " + d.getName() + " (" + d.getSpecialty() + ")");
    }
}