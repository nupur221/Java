import java.util.Scanner;

class A
{
   String name;
   int id;
   String department;
   
   void getInfo()
   {
       Scanner input = new Scanner(System.in);

       System.out.print("Name :");
       name = input.nextLine();

       System.out.print("ID : ");
       id = input.nextInt();

       input.nextLine();
       System.out.print("Department : ");
       department = input.nextLine();

       input.close();
   }
}
class B extends A
{
    String rose;
    void getInfo2()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Section : ");
        rose = input.nextLine();
        input.close();
    }
}

class C extends B
{
    String university;
    void getInfo3()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("University Name : ");
        university = input.nextLine();
        input.close();
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        
        A a1 = new A();
        a1.getInfo();

        B a2 = new B();
        a2.getInfo();
        a2.getInfo2();
        
        C a3 = new C();
        a3.getInfo();
        a3.getInfo2();
        a3.getInfo3();
        

    }
}
