class Animal{

    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog bark!");
    }
}

class Cat extends Animal{

    void sound(){
        System.out.println("Cat Meow!");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Animal animal;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
    }
}
