abstract class MobileUser{
    void call() // non abstract method
    {
      System.out.println("call method");
    }

    abstract  void SendMessage();  //abstract method
  }
  
  class Rahim extends MobileUser{
      @Override
      void SendMessage()
      {
         System.out.println("Hii, I am Rahim");
      }
  }
  
  class karim extends MobileUser{
      @Override
      void SendMessage()
      {
          System.out.println("Hi , I am karim");
      }
  }
  public class test {

    public static void main(String[] args) {
        MobileUser ms;  // reference variable;
        ms = new Rahim();
        ms.SendMessage();
        ms.call();

        ms = new karim();
        ms.SendMessage();
        ms.call();


    }
      
  }
