class RunnableInterface implements Runnable {
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        RunnableInterface r1 = new RunnableInterface();
        Thread t1 = new Thread(r1);  //Using the constructor Thread(Runnable r) 
        t1.start();
    }
}
