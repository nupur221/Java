// Thread 1: Food Preparation
class FoodPreparation extends Thread {

    private String item;

    public FoodPreparation(String item) {
        this.item = item;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Preparing " + item + " step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Preparation interrupted");
            }
        }
        System.out.println(item + " is ready!");
    }
}

// Thread 2: Delivery Tracking
class DeliveryTracking implements Runnable {

    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Delivery arriving in " + i + " minutes");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Delivery interrupted");
            }
        }
        System.out.println("Delivery completed!");
    }
}

// Main class
public class foodOrderingSyatem {
    public static void main(String[] args) {

        // Create threads
        FoodPreparation t1 = new FoodPreparation("Pizza");

        Thread t2 = new Thread(new DeliveryTracking());

        // Start threads
        t1.start();
        t2.start();
    }
}
