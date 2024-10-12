class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    public void printColor(){
        System.out.println("Dog class : "+color);
        System.out.println("Super class : "+(super.color));
    }
}

public class Third {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
