import java.util.Scanner;

interface Car{
    abstract void run();
}

class bike implements Car{
    public void run(){
        String model;
        int price;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the model name :");
        model = input.nextLine();
        System.out.print("Enter the price :");
        price = input.nextInt();
        
        System.out.println("Bike Model: " + model);
        System.out.println("Bike Price: " + price);
    }
}


public class Multi_interface {
    public static void main(String[] args) {
        bike b = new bike();
        b.run();
    }
    
}
