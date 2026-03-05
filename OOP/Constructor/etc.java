//perameterized  constructor

class constructor {
    String name,gender;
    int age;
    int phone;
    constructor(String n, String g, int a, int p)
    {
      name = n;
      gender =g;
      age = a;
      phone = p;
    }
    void displayInformation()
    {
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Age : " +age);
        System.out.println("Phone : " +phone);
        System.out.println("\n\n");
    }
}
 public class etc{
    public static void main(String[] args) {
       constructor t1 = new constructor("Fahmida Nupur" , "Female" , 23 , 03455475613);
       t1.displayInformation();
       constructor t2 = new constructor("Parul Akter" , "Female" , 30 , 01532456756);
       t2.displayInformation();
        
    }
}
