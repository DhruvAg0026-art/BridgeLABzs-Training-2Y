import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class MovieTheater {
    private Map<String, Boolean> seats;  // seatNumber -> isBooked

    public MovieTheater() {
        seats = new HashMap<>();
        // Initialize seats (A1 to A10)
        for (int i = 1; i <= 10; i++) {
            seats.put("A" + i, false);
        }
    }

    public void bookSeat(String seatNumber) throws InvalidSeatException, SeatAlreadyBookedException {
        // Validate seat exists
        if (!seats.containsKey(seatNumber)) {
            throw new InvalidSeatException("Seat " + seatNumber + " does not exist");
        }

        // Check if seat is already booked
        if (seats.get(seatNumber)) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked");
        }

        // Book the seat
        seats.put(seatNumber, true);
        System.out.println("Successfully booked seat " + seatNumber);
    }

    public void displayAvailableSeats() {
        System.out.println("\nAvailable seats:");
        seats.forEach((seat, isBooked) -> {
            if (!isBooked) {
                System.out.print(seat + " ");
            }
        });
        System.out.println();
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            theater.displayAvailableSeats();
            System.out.print("\nEnter seat number to book (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                theater.bookSeat(input);
            } catch (InvalidSeatException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (SeatAlreadyBookedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Thank you for using our booking system!");
    }
}