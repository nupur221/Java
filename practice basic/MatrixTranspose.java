import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        int i,j;
        System.out.print("Enter the number of rows and columns : ");
        Scanner rc = new Scanner(System.in);
        int row = rc.nextInt();
        int col = rc.nextInt();
        int a[][] = new int[row][col];
        System.out.print("Enter the element of an array : \n");
        for(i =0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print("A[" +i+ "] [" +j+ "] :");
                a[i][j] = rc.nextInt();
            }
        }
        System.out.println("Given Matrix = ");
        for( i = 0 ; i<row ; i++)
        {
            for( j = 0; j<col; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix = ");
        for( i = 0 ; i<col ; i++)
        {
            for( j = 0; j<row; j++)
            {
                System.out.print( a[j][i]+" ");
            }
            System.out.println();
        }

    }
}
