public class multiNaming extends Thread {
   public void run()
   {
    System.out.println("Running........");
   }
   
   public static void main(String[] args) {
       multiNaming m1 = new multiNaming();
       multiNaming m2 = new multiNaming();
       multiNaming m3 = new multiNaming();

       System.out.println("Name of m1:" +m1.getName());
       System.out.println("Name of m2:" +m2.getName());
       System.out.println("Name of m3:" +m3.getName());

       m1.start();
       m2.start();
       m3.start();

       m1.setName("Fahmida Mazumder Nupur.");
       System.out.println("After changing name of m1:" +m1.getName());
   }
}
