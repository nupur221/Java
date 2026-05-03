import static java.lang.Thread.sleep;

class customThread1 implements Runnable{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("AA");
            try{
                sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class customThread2 implements Runnable{
    public void run(){
        for(int i = 0; i<=10; i++){
            System.out.println("BB");
            try{
                sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class customThreadInterface {
     public static void main(String[] args) {
        customThread1 t1 = new customThread1();
        customThread2 t2 = new customThread2();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
    
}
