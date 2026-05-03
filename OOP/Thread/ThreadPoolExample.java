import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPool implements Runnable {
    private String taskName;

    public ThreadPool(String str) {
        taskName = str;
    }

    public void run() {
        try {
            for (int j = 0; j <= 5; j++) {
                if (j == 0) {
                    Date dt = new Date(j);
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

                    System.out.println("Initialization time for the task name: " + taskName + " = " + sdf.format(dt));

                } else {
                    Date dt = new Date(j);
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

                    System.out.println("Time of execution for the task name: " + taskName + " = " + sdf.format(dt));

                }

                Thread.sleep(1000);
            }

            System.out.println(taskName + " is complete.");
        }

        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

public class ThreadPoolExample {

    static final int MAX_TH = 3;

    public static void main(String argvs[]) {

        Runnable rb1 = new ThreadPool("task 1");
        Runnable rb2 = new ThreadPool("task 2");
        Runnable rb3 = new ThreadPool("task 3");
        Runnable rb4 = new ThreadPool("task 4");
        Runnable rb5 = new ThreadPool("task 5");

        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);

        pl.shutdown();
    }
}
