import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        int n,i=0;
        int binary[] = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        n = input.nextInt();
        while(n!= 0)
        {
            binary[i] = n%2;
            n = n/2;
            i++;
        }
        System.out.print("Binary value is :");
        for(int j= i-1;j>=0;j--)
        {
            System.out.print(" "+binary[j]);
        }
    }
}
