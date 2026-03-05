public class ThreadString {
    public static void main(String[] args) {
        Thread t = new Thread("My Name");
        t.start();

        String str = t.getName();
        System.out.println(str);
    }
    
}
