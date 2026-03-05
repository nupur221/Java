import java.util.Scanner;

class a{
      String name;
      String fathers_name;
      double h_no;
      int id;

      void display()
      {
        Scanner val = new Scanner(System.in);
        System.out.print("Name : ");
        name = val.nextLine();

        System.out.print("Fathers Name : ");
        fathers_name = val.nextLine();

        System.out.print("Home Adress : ");
        h_no = val.nextDouble();

        System.out.print("Home ID : ");
        id = val.nextInt();

      }
}
class b extends a
{
      String country;
      void display2()
      {
        Scanner val1 = new Scanner(System.in);
        System.out.print("Country Name : ");
        country = val1.nextLine();
      }
}
public class SingleInheritance {
    public static void main(String[] args) {
       // a a1 = new a();
       // a1.display();
       // a1.display2();

        b b1 = new b();
        b1.display();
        b1.display2();
    }
}
