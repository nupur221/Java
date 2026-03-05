import java.util.Scanner;
class AgeOutOfRangeException extends Exception{
    int age;
    AgeOutOfRangeException(int age){
        this.age = age;
    }
     @Override
    public String toString() {
        return "You are older than the requested age (25 years), you are 40!!!.";
    }
    
}
 class LowGpaException extends Exception {
    
    LowGpaException(){
        super();
    }
    
   @Override
    public String toString() {
        return "Your GPA is not sufficient to apply for this job (2.5).";
        
    }
}

public class GPA {
    
    public static void main(String[] args) {
        try{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Age please: ");
        int age;
        age = input.nextInt();
        if(age > 25){
            throw new AgeOutOfRangeException(age); 
        }
        
        System.out.print("Enter Your GPA please: ");
        float gpa;
        gpa = input.nextFloat();
         if(gpa < 2.5){
            throw new LowGpaException(); 
        }
         
         System.out.println("Your application is accepted and is under study.");
      }
        catch(AgeOutOfRangeException e){
            System.out.println(e);
        }
        
        catch(LowGpaException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        

    }
}