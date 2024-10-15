interface Transport{
    void deliver();
}

abstract class Animal {
    abstract void sound();
}

class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger roars");
    }
}
class Camel extends Animal implements Transport{
    public void sound(){
        System.out.println("Camel grunts");
    }
    public void deliver(){
        System.out.println("Camel Delevier");
    }
}
class Monkey extends Animal implements Transport{
    public void sound(){
        System.out.println("Monkey sound");
    }
    public void deliver(){
        System.out.println("Monkey Delevier");
    }
}


public class Third {
    public static void main(String[] args) {
        Animal[] a = new Animal[3];
        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Monkey();

        for(Animal  animal: a){
            animal.sound();
        }
    }
}
