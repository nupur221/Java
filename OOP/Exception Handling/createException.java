// public class createException {
//     public static void main(String[] args){
//        try {
//             int result = 10 / 0;
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Cannot divide by zero!");
//         }
//         finally {
//             System.out.println("This block will always execute.");
//         }
//         System.out.println("Program continues...");
//     }
// }


import java.util.Scanner;
import java.util.InputMismatchException;

public class createException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number n1: ");
            int n1 = sc.nextInt();

            System.out.print("Enter number n2: ");
            int n2 = sc.nextInt(); // error if input is "hello"

            int sum = n1 + n2;
            System.out.println("Sum = " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Input error: " + e);
            System.out.println("Error: Please enter valid integers only!");
        }

        System.out.println("Program continues...");
    }
}