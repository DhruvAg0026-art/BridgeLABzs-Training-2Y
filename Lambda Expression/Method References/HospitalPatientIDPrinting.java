package MethodReferences;

import java.util.Arrays;
import java.util.List;

public class HospitalPatientIDPrinting {
public static void main(String[] args) {
        List<Integer> patientIDs = Arrays.asList(101, 102, 103, 104);

        // Using method reference instead of lambda
        patientIDs.forEach(System.out::println);
    }
    
}
