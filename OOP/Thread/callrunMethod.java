public class callrunMethod extends Thread {
   public void run()
   {
     for(int i = 1 ;i<5 ; i++)
     {
       try
       {
           Thread.sleep(500);
       }
       catch(InterruptedException e)
       {
         System.out.println(e);
       }
       System.out.print(" "+i);   
     }
   } 

   public static void main(String[] args) {
     
    callrunMethod c1 = new callrunMethod();
    callrunMethod c2 = new callrunMethod();
    c1.run();
    c2.run();
   }
}
