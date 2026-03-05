import java.util.Scanner;

class Course
{
   int course_code;
   String course_name;
   int course_credit;

   void getDescription()
   {
       Scanner input = new Scanner(System.in);

       System.out.print("Course Code : ");
       course_code = input.nextInt();
       input.nextLine(); // consume the leftover newline

       System.out.print("Course Name : ");
       course_name = input.nextLine();

       System.out.print("Course Credit : ");
       course_credit = input.nextInt();

       // Don't close the Scanner here as it will close System.in
   }
}

class ComputerScienceCourse extends Course
{
    @Override
    void getDescription() {
        super.getDescription();
        System.out.print("Unique feature of Computer Science courses : ");
        System.out.println("Programming Assignment.");
        System.out.println(); // Add spacing between courses
    }
}

class BusinessCourse extends Course
{
   @Override
   void getDescription() {
       super.getDescription();
       System.out.print("Unique feature of Business courses : ");
       System.out.println("Case Study.");
       System.out.println();
   }
}

class LiteratureCourse extends Course
{
    @Override
    void getDescription() {
        super.getDescription();
        System.out.print("Unique feature of Literature courses : ");
        System.out.println("Essays.");
        System.out.println();
    }
}

public class Main1
 {
    public static void main(String[] args) {
        ComputerScienceCourse c1 = new ComputerScienceCourse();
        c1.getDescription();
        
        BusinessCourse c2 = new BusinessCourse();
        c2.getDescription();
        
        LiteratureCourse c3 = new LiteratureCourse();
        c3.getDescription();
    }
}