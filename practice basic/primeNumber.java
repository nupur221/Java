import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
      int n;
      Scanner primeN = new Scanner(System.in) ;

      System.out.print("Enter an integer number : ");
      n = primeN.nextInt();
      //condition
      int count =0;
         for( int i =2 ; i<n ; i++)
        {
             if(n%i == 0)
              {
                 count = count + 1;
                 break;
              }
        }
          if(count == 0)
           {
                System.out.println(n+ " is prime number.");
           }
         else
            {
                System.out.println(n+ " is not prime.");
            }
       }
      
    }
