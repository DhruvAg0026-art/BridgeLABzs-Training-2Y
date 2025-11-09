public class MainHospitalDemo {
    public static void main(String[] args) {
        Hospital hosp = new Hospital("City Hospital");

        Doctor d1 = new Doctor("D001", "Alice Martin", "Cardiology");
        Doctor d2 = new Doctor("D002", "Brian Chen", "Pediatrics");

        Patient p1 = new Patient("P001", "John Doe");
        Patient p2 = new Patient("P002", "Mary Jane");

        hosp.registerDoctor(d1);
        hosp.registerDoctor(d2);
        hosp.registerPatient(p1);
        hosp.registerPatient(p2);

        hosp.listDoctors();
        hosp.listPatients();

        // consultations demonstrating association and communication
        d1.consult(p1, "Chest pain, ECG ordered.");
        p2.consult(d2, "Fever and cough.");
        d1.consult(p2, "Follow-up on blood pressure.");

        System.out.println();
        d1.listPatients();
        System.out.println();
        p2.listDoctors();
    }
}