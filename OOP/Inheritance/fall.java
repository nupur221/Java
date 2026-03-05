import java.util.Scanner;

class Course
{
   int course_code;
   String course_name;
   int course_credit;

void getDescription()
{
    Scanner input = new Scanner(System.in);

    System.out.println("Course Code : ");
    course_code = input.nextInt();

    input.nextLine();
    System.out.println("Course Name : ");
    course_name = input.nextLine();

    input.nextInt();
    System.out.println("Course Credit : ");
    course_credit = input.nextInt();

    input.close();
}
static class  ComputerScienceCourse extends Course
{
    @Override
    void getDescription() {
        super.getDescription();
        System.out.println("Unique feature of Computer Science courses : ");
        String is = "Programming Assignment.";
        System.out.println("" +is);

    }

}

static class BusinessCourse extends Course
{
   @Override
   void getDescription() {
       super.getDescription();
       System.out.println("Unique feature of Business courses : ");
       String is = "Case Study.";
       System.out.println("" +is);

   }

}

static class LiteratureCourse extends Course
{

    @Override
    void getDescription() {
        super.getDescription();
        System.out.println("Unique feature of Literature courses : ");
        String is = "Essays.";
        System.out.println("" +is);
    }
}


static class fall
 {
    public static void main(String[] args) {
        ComputerScienceCourse p1 = new ComputerScienceCourse();
        p1.getDescription();
        BusinessCourse p2 = new BusinessCourse();
        p2.getDescription();
        LiteratureCourse p3 = new LiteratureCourse();
        p3.getDescription();
    }
}
}
