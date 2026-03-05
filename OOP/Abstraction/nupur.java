import java.util.Scanner;

 abstract class Shape{
    double a,b;
     abstract void area();

}

class Rectangle extends Shape{
    void area(){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the value of Height :");
    a = input.nextInt();
    System.out.print("Enter the value of Width :");
    b = input.nextInt();

   double  result = a * b;
   System.out.print("Area of Rectangle is :" +result);
   }
}

class Circle extends Shape{
    void area(){
        double r;
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the value of redius :");
        r = input.nextInt();

       double  result = Math.PI * r *r;
       System.out.print("The area of circle is :" +result);

    }

}
class Triangle extends Shape{
    void area(){
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the value of Height :");
        a = input.nextInt();
        System.out.print("Enter the value of Width :");
        b = input.nextInt();

        double result = 0.5 * a * b;
        System.out.println("The area of Triangle :" +result);
    }

}

public class nupur {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
        Circle c1 = new Circle();
        c1.area();
        Triangle t1 = new Triangle();
        t1.area();

    }
    
}
