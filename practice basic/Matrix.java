import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int r = ar.nextInt();
        System.out.print("Enter the number of column : ");
        int c = ar.nextInt();
        int [][]a = new int [r][c];
       

        for(int i = 0 ; i<a.length ; i++)
        {
            for(int j = 0; j<a[0].length; j++)
            {
                System.out.print("A["+(i)+"]["+(j)+"] :");
                a[i][j] = ar.nextInt();
            }
        }
        System.out.println("Matrix = ");
        for(int i = 0 ; i<a.length ; i++)
        {
            for(int j = 0; j<a[0].length; j++)
            {
                System.out.print( a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
