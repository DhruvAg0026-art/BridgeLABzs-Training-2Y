import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private final String id;
    private final String name;
    private final String specialty;
    private final List<Patient> patients = new ArrayList<>();

    public Doctor(String id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialty() { return specialty; }
    public List<Patient> getPatients() { return new ArrayList<>(patients); }

    // communication: doctor consults a patient (adds association both ways)
    public void consult(Patient p, String notes) {
        if (p == null) return;
        if (!patients.contains(p)) {
            patients.add(p);
            p.addDoctorOnly(this);
        }
        System.out.printf("Consultation: Dr. %s (%s) with patient %s — Notes: %s%n",
                name, specialty, p.getName(), notes == null ? "(no notes)" : notes);
    }

    // helper used by Patient to avoid recursion
    void addPatientOnly(Patient p) {
        if (p == null) return;
        if (!patients.contains(p)) patients.add(p);
    }

    public void listPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        if (patients.isEmpty()) { System.out.println("  (none)"); return; }
        for (Patient p : patients) System.out.println("  - " + p.getId() + " : " + p.getName());
    }
}