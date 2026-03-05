class sample1 extends Thread{
    public void run()
    {
        System.out.println("Task one");
    }
}
class sample2 extends Thread{
    public void run()
    {
        System.out.println("Task Two");
    }
}

public class MultiTasking {
    public static void main(String[] args) {
        sample1 s1 = new sample1();
        sample2 s2 = new sample2();

        s1.start();;
        s2.start();
    }
    
}
