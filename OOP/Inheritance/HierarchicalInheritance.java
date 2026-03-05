import java.util.Scanner;

class car
{
    String model;
    int year;
    double dailyRentalPrice;
    
    void getDescription()
    {
       Scanner input = new Scanner(System.in);
    
       System.out.print("Model Name : ");
       model = input.nextLine();

       System.out.print("Year : ");
       year = input.nextInt();

       System.out.print("Daily Rental Price : ");
       dailyRentalPrice = input.nextDouble();
       
       input.close();

    }
    void calculation()
    {
       System.out.println("The weekly rent : " +dailyRentalPrice*7);
    }
}

class EconomyCar extends car
{
    @Override
    void getDescription() {
        System.out.println("Details of Economy car. ");
        super.getDescription();
        System.out.print("\nUnique feature of Economy cars : "); 
        String uni ="Good fuel efficiency";
        System.out.println("" +uni);
       // Scanner u = new Scanner(System.in);
        //System.out.println();
       // uni = u.nextLine();
        System.out.println("\n");
        super.calculation();

    }
}

class CompactCar extends car
{
    @Override
    void getDescription()
    {
       System.out.println("Details of Compact car.");
       super.getDescription();
       System.out.print("\nUnique feature of Compact cars : "); 
       String uni = "Easy to park";
       System.out.println(""+uni);
      // Scanner u = new Scanner(System.in);
       //System.out.println();
      // uni = u.nextLine();
       super.calculation();
       System.out.println("\n");
    }

}

class LuxuryCar extends car
{
    @Override
  void getDescription()
  {
    System.out.println("Details of Luxury car. ");
    super.getDescription();
    System.out.print("\nUnique feature of Luxury cars : "); 
    String uni = "GPS navigation and heated seats";
    System.out.println("" +uni);
   // Scanner u = new Scanner(System.in);
   // System.out.println();
   // uni = u.nextLine();
    System.out.println("\n");
    super.calculation();

  }

}

public class HierarchicalInheritance
 {
    public static void main(String[] args)
    {
        EconomyCar c1 = new EconomyCar();
        c1.getDescription();
        CompactCar c2 = new CompactCar();
        c2.getDescription();
        LuxuryCar c3 = new LuxuryCar();
        c3.getDescription();

    }
}
