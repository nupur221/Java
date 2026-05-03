import java.util.Scanner;

// User-defined exception for invalid tickets
class InvalidTicketException extends Exception {
    public InvalidTicketException(String str) {
        super(str);
    }
}

// User-defined exception for age restriction
class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String str) {
        super(str);
    }
}

// Main class
public class MovieTicketBookingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // User input
            System.out.print("Enter movie name: ");
            String movie = sc.nextLine();

            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            // Validation: tickets
            if (tickets < 2 || tickets > 10) {
                throw new InvalidTicketException("Number of tickets must be between 2 and 10");
            }

            // Validation: age restriction
            if (age < 18) {
                throw new AgeRestrictionException("You must be at least 18 to book tickets");
            }

            // If all valid
            System.out.println("Booking Confirmed!");
            System.out.println("Movie: " + movie);
            System.out.println("Tickets: " + tickets);

        } catch (InvalidTicketException e) {
            System.out.println("Ticket Error: " + e);
            System.out.println("Booking Failed!");

        } catch (AgeRestrictionException e) {
            System.out.println("Age Error: " + e);
            System.out.println("Booking Failed!");

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
