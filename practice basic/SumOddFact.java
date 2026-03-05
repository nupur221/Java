import java.util.Scanner;
public class SumOddFact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter an integer number : ");
        n = input.nextInt();
        int sum = 0; 
        for ( i = 1; i <= n; i=i+2)
        { 
            int fact = 1; 
            for ( j = 1; j <= i; j++)
            { 
                fact = fact * j;
            }
            sum = sum + fact; 
        }
        System.out.println("Summation of factorial odd numbers up to " + n + " is " + sum);
    }
}


