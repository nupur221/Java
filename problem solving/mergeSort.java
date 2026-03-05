import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students :");
        int n = input.nextInt();

        float [] a = new float[n];

        System.out.print("Enter Unsorted CGPA :");
        for(int i = 0 ; i<n ; i++){
            a[i] = input.nextInt();
        }
        mSort (a,0,a.length-1);
        System.out.print("After sorting  :");
        for(float x : a) System.out.print(" " +x);
    }
    private static void mSort(float[] a, int i, int j) {
        if(i<j){
            int mid = (i+j)/2;
            mSort(a,i,mid);
            mSort(a, mid+1, j);
            merge(a,i,mid,j);
        }
    }
     private static void merge(float[] a, int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        int k = low;
        int [] b = new int[a.length];

        while(i<=mid && j<=high){
            if(a[i] < a[j]){
                b[k] = (int) a[i];
                i++;
                k++;
            } else {
                b[k] = (int) a[j];
                j++;
                k++;
            }
        }
        while(i<= mid){
            b[k] = (int) a[i];
            i++;
            k++;
        }
        while(j <= high){
            b[k] = (int) a[j];
            j++;
            k++;
        }
        for(i = low ; i<= high ; i++){
            a[i] = b[i];
        }
    }
    
}
