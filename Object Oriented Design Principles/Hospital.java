import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final String name;
    private final List<Doctor> doctors = new ArrayList<>();
    private final List<Patient> patients = new ArrayList<>();

    public Hospital(String name) { this.name = name; }

    public String getName() { return name; }

    public void registerDoctor(Doctor d) {
        if (d != null && !doctors.contains(d)) doctors.add(d);
    }

    public void registerPatient(Patient p) {
        if (p != null && !patients.contains(p)) patients.add(p);
    }

    public Doctor findDoctorById(String id) {
        for (Doctor d : doctors) if (d.getId().equals(id)) return d;
        return null;
    }

    public Patient findPatientById(String id) {
        for (Patient p : patients) if (p.getId().equals(id)) return p;
        return null;
    }

    public void listDoctors() {
        System.out.println("Doctors at " + name + ":");
        if (doctors.isEmpty()) { System.out.println("  (none)"); return; }
        for (Doctor d : doctors) System.out.println("  - " + d.getId() + " : " + d.getName() + " (" + d.getSpecialty() + ")");
    }

    public void listPatients() {
        System.out.println("Patients at " + name + ":");
        if (patients.isEmpty()) { System.out.println("  (none)"); return; }
        for (Patient p : patients) System.out.println("  - " + p.getId() + " : " + p.getName());
    }
}