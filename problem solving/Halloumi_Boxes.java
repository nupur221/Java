import java.util.Scanner;
public class Halloumi_Boxes {
	
	static Scanner input = new Scanner(System.in);
	static int t, n, k;
	
	static long a[];
    
	private static boolean isSorted(long a[]) {
		
		for(int i = 1; i < a.length; i++) {
			
			if(a[i - 1] > a[i]) return false;
		}
		return true;
	}
	
	static void dark_chocolate() {
		
		if(isSorted(a) || k > 1) System.out.println("YES");
		else System.out.println("NO");	
	}
	private static void input() {
		
		n = input.nextInt();
		k = input.nextInt();
		
		a = new long[n];
		
		for(int i = 0; i < n; i++) a[i] = input.nextLong();
	}
	
	public static void main(String [] args) {
		
		t = input.nextInt();
		
		for(int i = 0; i < t; i++) {
			input();
			dark_chocolate();
			
		}
	}
}

