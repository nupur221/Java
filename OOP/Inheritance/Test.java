class student
{
    String name;
    int age;

    void displayInformation1()
    {
         System.out.println("Name : " +name);
         System.out.println("Age :" +age);
    }
}

class teacher extends student
{
     //name,age,displainformation()

     String qualification;
     int id;

     void displayInformation2()
     {
        System.out.println("Name :" +name);
        System.out.println("Age :" +age);
        System.out.println("Qualification :" +qualification);
        System.out.println("ID :" +id);
     }
}

public class Test
{
    public static void main(String[] args)
    {
       teacher t1 = new teacher();
       
       t1.name = "Anisul Islam";
       t1.age = 30;
       t1.qualification = "MS.c in CSE";
       t1.id = 233;
       t1.displayInformation2();
       System.out.println("\n\n");

       student s1 = new student();
       s1.name = "Fahmida Nupur";
       s1.age = 20;
       s1.displayInformation1();

    }
}
