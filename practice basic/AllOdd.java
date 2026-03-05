import java.util.Scanner;

public class AllOdd {
    public static void main(String[] args) {
        int n ,i;
        System.out.print("Enter an integer number : ");
        try (Scanner input = new Scanner(System.in)) {
            n = input.nextInt();
            
            for(i=0;i<=n;i++)
            {
                if(i%2!=0)
            {
                System.out.print(" " +i);
            }
        }  
        
    }
 }
}
