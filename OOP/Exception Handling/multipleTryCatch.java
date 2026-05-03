// import java.util.Scanner;
// public class multipleTryCatch {
//     public static void main(String[] args){
//         try{
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();
//             int ans = n / 0;
//             int arr[] = {1,2,3,4,5};
//             System.out.println(arr[10]);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Cannot divide by zero!");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index is out of bounds!");
//         }
//     }
// }



// public class multipleTryCatch {
//     public static void main(String[] args) {
//         try {
//             int a = 10;
//             int b = 0;

//             int result = a / b;   // may cause ArithmeticException

//             int[] arr = {1, 2, 3};
//             System.out.println(arr[5]); // may cause ArrayIndexOutOfBoundsException

//         } catch (ArithmeticException e) {
//             System.out.println("Error: Cannot divide by zero!");

//         } catch (ArrayIndexOutOfBoundsException e) {   
//             System.out.println("Error: Invalid array index!");

//         } catch (Exception e) {
//             System.out.println("Error: Some unexpected problem occurred!");
//         }

//         System.out.println("Program continues normally...");
//     }
// }



import java.util.Scanner;

public class multipleTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
          
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            // Handles invalid number format
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handles any other unexpected exceptions
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            // Always executes
            System.out.println("Execution completed.");
            sc.close();
        }
    }
}
