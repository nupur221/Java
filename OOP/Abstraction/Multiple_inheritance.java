interface apple{
    void fruit();
}

interface hilsha{
    void fish();
}

class food implements apple,hilsha{
    public void fruit(){
        System.out.println("He has eating apple");
    }

    @Override
    public void fish() {
        System.out.println("He has eating Hilsha");
    }
}


public class Multiple_inheritance {
    public static void main(String[] args) {
        food f1 = new food();
        f1.fruit();
        f1.fish();
    }
    
}
