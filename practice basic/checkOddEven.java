import java.util.Scanner;

public class checkOddEven {
    public static void main(String[] args) {
       
        int n;
        System.out.print("Enter an integer number :");
        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();
            
            if(n%2==0)
            {
            System.out.println("This number " +n+ " is an Even number");
            }
            else
            {
            System.out.println("This number " +n+ " is an Odd number");
            }
        }
    }
}

