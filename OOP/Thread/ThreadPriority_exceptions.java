public class ThreadPriority_exceptions extends Thread {
       public static void main(String[] args) {
        Thread.currentThread().setPriority(17);

        System.out.println("Priority of the main thread is :" +Thread.currentThread().getPriority());
    }
}
