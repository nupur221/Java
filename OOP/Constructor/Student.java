 class main {
    String name,gender;
    int id,age;
    main()
    {
        System.out.println("Information");
    }
    void displayInformation()
    {
         System.out.println("Name : " +name);
         System.out.println("Gender : " +gender);
         System.out.println("ID : " +id);
         System.out.println("Age : " +age);
    }
}
 public class Student{
     public static void main(String[] args)
      {
         main s1 = new main();
         s1.displayInformation();
      }
}
