abstract class Shape{

    double dim1,dim2;
    
    Shape(double dim1 , double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();

}

class Rectangle extends Shape {
    Rectangle(double dim1 , double dim2){
        super(dim1,dim2);
    }
    void area(){
        double result = dim1 * dim2;
        System.out.println("Rectangle area ia :" +result);
    }

}
class Circle extends Shape{
    Circle(double r){
        super(r,r);
    }
    void area(){
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle area is :" +result);
    }

}

class Triangle extends Shape{
      Triangle(double dim1 , double dim2){
        super(dim1,dim2);
    }
    void area(){
        double result = 0.5 * dim1 * dim2;
        System.out.println("Triangle area ia :" +result);
    }

}


public class main {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle(10 ,20);
        shape.area();

        shape = new Circle(10);
        shape.area();

        shape = new Triangle(10, 20);
        shape.area();
    }
    
}

