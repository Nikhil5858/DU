class Shape{
    void draw(){
        System.out.println("Inside Shape");
    }
}

class Rectengle extends Shape{
    void area(){
        System.out.println("Inside area");
    }
}

class Cube extends Rectengle{
    void volume(){
        System.out.println("Inside volume");
    }
}

public class Multilevelin{
    public static void main(String[] args) {
        
        Cube d = new Cube();
        d.draw();
        d.area();
        d.volume();
    }
}