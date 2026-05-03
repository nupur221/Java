// public class throwKeyword {
//     public void eligibleForVote(int age){
//         if(age < 18) throw new IllegalArgumentException("You must be at least 18 years old to vote.");
//         else System.out.println("You are eligible to vote!");
//     }
//     public static void main(String[] args) {
//         throwKeyword obj = new throwKeyword();
//         obj.eligibleForVote(16);
//     }
// }



import java.util.Scanner;
public class throwKeyword {
    public void eligibleForVote(int age){
        if(age < 18) throw new IllegalArgumentException("You must be at least 18 years old to vote.");
        else System.out.println("You are eligible to vote!");
    }
    public static void main(String[] args) {
        throwKeyword obj = new throwKeyword();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            try {
                obj.eligibleForVote(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }
    }
}