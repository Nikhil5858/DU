class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

interface B {
    void bark();
}

interface C{
    void pet();
}

class Dog extends Animal implements B,C{
    public void bark(){
        System.out.println("Dog is Barking");
    }
    public void pet(){
        System.out.println("Dog is pet");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        d1.pet();
    }
}
