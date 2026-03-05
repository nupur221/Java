import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        int n, i,sum =0;
        System.out.print("Enter number : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int a[] = new int [100];

        for(i=0;i<n;i++)
        {
           System.out.print("A[" +i+ "] : ");
           a[i] = input.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum = sum + a[i];
        }
        System.out.print("Sum of the number is : " +sum);
        System.out.print("\n Average of the number is : " +sum/n);
    }
}
