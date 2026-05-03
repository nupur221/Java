public class createException {
    public static void main(String[] args){
       try {
            int a = 10 / 0;   // risky code
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("This block will always execute.");
        }
        System.out.println("Program continues...");
    }
}
