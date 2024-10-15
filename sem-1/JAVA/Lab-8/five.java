interface shape{
    double getArea();
}

class Rectangle implements shape{

    double length,width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }
}

class Circle implements shape
{
    double radious;
    double pi = 3.14;

    public Circle(double radious){
        this.radious = radious;
    }

    public double getArea(){
        return pi * radious * radious;
    }
}

class Triangle implements shape{

    double base,height;

    public Triangle(double base ,double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return 0.5 * base * height;
    }
}

public class five {
    public static void main(String[] args) {
        
        shape Rectangle = new Rectangle(10, 05);
        shape Circle = new Circle(7);
        shape Triangle = new Triangle(6, 8);
        System.out.println("Area of Rectangle : "+Rectangle.getArea());
        System.out.println("Area of Circle : "+Circle.getArea());
        System.out.println("Area of Triangle : "+Triangle.getArea());
    }
}
