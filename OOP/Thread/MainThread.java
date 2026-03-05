public class MainThread {
    public static void main(String[] args) {
        try
        {
            for(int i = 0 ; i<10; i++)
            {
                Thread.sleep(1000);
                System.out.print(" " +i);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
