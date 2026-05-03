public class handlethrows {
    static void demo() throws IllegalAccessException {
        System.out.println("Inside demo method");
        throw new IllegalAccessException("This is an illegal access exception");
    }
    public static void main(String[] args) {
        try {
            demo();
        } catch (IllegalAccessException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
