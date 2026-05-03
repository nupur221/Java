class customThread1 extends Thread{
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
class customThread2 extends Thread{
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

public class CustomThreadInheritance{
    public static void main(String[] args) {
        customThread1 t1 = new customThread1();
        customThread2 t2 = new customThread2();
        t1.start();
        t2.start();
    }
}
