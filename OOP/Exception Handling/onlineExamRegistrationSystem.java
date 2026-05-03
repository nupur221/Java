
import java.util.Scanner;

// Interface
interface RegistrationValidator {
    void validate(String name, int studentId, String courseCode)
        throws StudentNameException, StudentIdException;
}

// Custom exception 1
class StudentNameException extends Exception {
    public StudentNameException(String str) {
        super(str);
    }
}

// Custom exception 2
class StudentIdException extends Exception {
    public StudentIdException(String str) {
        super(str);
    }
}

// Service class
class ExamRegistrationService implements RegistrationValidator {

    private String name;
    private int studentId;
    private String courseCode;
    public String status;

    public ExamRegistrationService(String name, int studentId, String courseCode) {
        this.name = name;
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.status = "Not Registered";
    }

    @Override
    public void validate(String name, int studentId, String courseCode)
        throws StudentNameException, StudentIdException {

        // Name validation
        if (name == null || name.length() < 3 || !name.matches("[a-zA-Z ]+")) {
            throw new StudentNameException("Name must be at least 3 characters long and contain only letters and spaces.");
        }

        // Student ID validation
        if (studentId < 100 || studentId > 200) {
            throw new StudentIdException("Student ID must be between 100 and 200.");
        }
    }

    // Process method
    public void register() {
        try {
            validate(name, studentId, courseCode);

            System.out.println("Registration Successful!");
            System.out.println("Name: " + name.toUpperCase());
            System.out.println("Student ID: " + studentId);
            System.out.println("Course Code: " + courseCode);

            status = "Registered Successfully";

        } catch (StudentNameException | StudentIdException e) {
            status = "Registration Failed: " + e.getMessage();

        } catch (Exception e) {
            status = "Registration Failed: Unexpected error";
        }
    }
}

// Main class
public class onlineExamRegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = sc.nextLine();

        ExamRegistrationService service = new ExamRegistrationService(name, studentId, courseCode);

        service.register();

        // OUTPUT status
        System.out.println("Final Status: " + service.status);
    }
}
