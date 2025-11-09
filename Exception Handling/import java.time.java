import java.time.LocalDate;

class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}

class VehicleMaintenance {
    private LocalDate lastServiceDate;
    private int currentMileage;
    private static final int SERVICE_INTERVAL_DAYS = 180; // 6 months

    public VehicleMaintenance(LocalDate lastServiceDate, int currentMileage) {
        this.lastServiceDate = lastServiceDate;
        this.currentMileage = currentMileage;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (currentMileage < 0) {
            throw new InvalidMileageException("Mileage cannot be negative");
        }

        LocalDate nextServiceDue = lastServiceDate.plusDays(SERVICE_INTERVAL_DAYS);
        if (LocalDate.now().isAfter(nextServiceDue)) {
            throw new ServiceOverdueException("Service overdue! Last service was on " + lastServiceDate);
        }

        System.out.println("Vehicle maintenance status: OK");
    }
}

public class VehicleMaintenanceSystem {
    public static void main(String[] args) {
        // Create instance with last service date 7 months ago
        VehicleMaintenance vehicle = new VehicleMaintenance(
            LocalDate.now().minusMonths(7),
            50000
        );

        try {
            vehicle.checkMaintenance();
        } catch (ServiceOverdueException e) {
            System.out.println("Warning: " + e.getMessage());
            System.out.println("Please schedule service immediately!");
        } catch (InvalidMileageException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please check mileage input.");
        }
    }
}