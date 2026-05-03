class createThread extends Thread {
     public void run(){
            System.out.println("Fahmida Mazumder Nupur.");
        }
        public static void main(String[] args) {
            createThread t1 = new createThread();
            t1.run();
            t1.start();
        }
}

