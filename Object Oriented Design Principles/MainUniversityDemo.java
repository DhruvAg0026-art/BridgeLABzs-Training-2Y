public class MainUniversityDemo {
    public static void main(String[] args) {
        // create faculty independently (aggregation)
        Faculty f1 = new Faculty("F001", "Dr. Smith");
        Faculty f2 = new Faculty("F002", "Dr. Lee");
        Faculty f3 = new Faculty("F003", "Dr. Kumar");

        University uni = new University("Global University");

        // add faculty references to university (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);

        // create departments (composition: belong to university)
        University.Department cs = uni.addDepartment("Computer Science");
        University.Department math = uni.addDepartment("Mathematics");

        // assign faculty to departments (aggregation: shared references)
        cs.assignFaculty(f1);
        cs.assignFaculty(f2);
        math.assignFaculty(f3);

        System.out.println("Before shutdown:");
        uni.listStructure();

        // shutdown university -> departments removed (composition)
        uni.shutdown();

        System.out.println("\nAfter shutdown:");
        // departments removed; faculty still exist independently
        uni.listStructure(); // will show no departments
        System.out.println("\nFaculty objects still usable outside university:");
        System.out.println(" - " + f1);
        System.out.println(" - " + f2);
        System.out.println(" - " + f3);
    }
}