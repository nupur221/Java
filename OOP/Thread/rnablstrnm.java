public class rnablstrnm implements Runnable {

    public void run() {
        System.out.println("Fahmida Nupur");
    }

    public static void main(String[] args) {
        Runnable r1 = new rnablstrnm();
        Thread th1 = new Thread(r1, "My name");

        th1.start();

        String str = th1.getName();
        System.out.println(str);

    }

}
