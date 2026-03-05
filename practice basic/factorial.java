import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer nummber = ");
        int n =input.nextInt();
        int i =1,fact =1;
        for(i=1;i<=n;i++)
        {
            fact = fact*i;
        }

        System.out.println("Factorial of the number is = " +fact);
    }
}

