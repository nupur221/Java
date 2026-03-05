import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = input.nextInt();
        int first =0;
        int second = 1;
        int fibo;
        int sum = 0;
        System.out.print(first+" "+second);
        for(int i = 3;i<=n;i++)
        {
            fibo = first + second;
            System.out.print(" "+fibo);
            
            first = second;
            second = fibo;
           // sum += second;
        }
       // System.out.println("\nSum of the fibo series :" +sum);
    }
}
