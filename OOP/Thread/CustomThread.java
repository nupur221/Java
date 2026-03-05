class CustomThread extends Thread {
    
   public void run()
   {
       for(int i =1 ;i<11 ; i++)
       {
        try
        {
          Thread.sleep(1000); //sleep() method try block er vitor rakha lage karon negative value dile exception throw kore,ar time negative hote pare na.
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.print(" " +i);
       }
   }
   public static void main(String[] args) {
   
    
         CustomThread c1 = new CustomThread();
         CustomThread c2 = new CustomThread();
    

         c1.start();
         c2.start();
    
     
     
   
   } 
}
