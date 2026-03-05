
 public class constructoroverloading{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.displayInformation();
        Teacher t2 = new Teacher("Nupur" , "Cumilla");
        t2.displayInformation();
        Teacher t3 = new Teacher("Nupur" , "Cumilla" , 01537654321);
        t3.displayInformation();
    }
}
   class Teacher {
    String name,hometown;
    int phone;
    
    Teacher()
    {
        System.out.println("No information.");
    }
    Teacher(String n , String h)
    {
        name = n;
        hometown = h;
    }
    Teacher(String n , String h , int p)
    {
        name = n;
        hometown = h;
        phone = p;
    }
    void displayInformation()
    {
        System.out.println("Name :" +name);
        System.out.println("Hometown :" +hometown);
        System.out.println("Phone :" +phone);
    }
}
