interface Animal{
abstract void eat();
}

class Dog implements Animal{
    public void eat(){
        System.out.println("Dogs eating murgi.");
    }
}

class Cat implements Animal{
    public void eat(){

        System.out.println("Cat is sleeping.");
    }
}

public class Interfacee {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
    }
  
}
