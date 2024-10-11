interface MyInterface1{
    public void start();
    public void stop();
}

interface MyInterface2{
    public void TurnLeft();
    public void TurnRight();
}

class extra{
        String color = "Red";
}

class Ferrari extends extra implements MyInterface1,MyInterface2{
    public void start(){
        System.out.println("Ferrai was Start!  "+color);
    }
    public void TurnLeft(){
        System.out.println("Ferrari Turned Left");
    }
    public void TurnRight(){
        System.out.println("Ferrari Turned Right");
    }
    public void stop(){
        System.out.println("Ferrari was stop!");
    }
}

public class InterfaceDemo{
    public static void main(String[] args){

        Ferrari f1 = new Ferrari();
        f1.start();
        f1.TurnLeft();
        f1.TurnRight();
        f1.stop();
    }
}