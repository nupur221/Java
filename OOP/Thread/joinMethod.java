class joinMethod extends Thread {
   public void run()
   {
    for(int i = 1;i<=5;i++)
    {
        try
        {
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.print(" " +i);
    }
   } 

   public static void main(String[] args) {
    
    joinMethod j1 = new joinMethod();
    joinMethod j2 = new joinMethod();
    joinMethod j3 = new joinMethod();

    j1.start();
    try{
        j1.join(2000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

    j2.start();
    j3.start();
     
  }
}
