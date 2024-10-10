abstract class Car{
    abstract double average();
}

class Ferrari extends Car{
    double average(){
        return 8;
    }
}

class Benz extends Car{
    double average(){
        return 9;
    }
}

public class abstract_Demo {

    public static void main(String[] args){


        Car f = new Ferrari();
        System.out.println("Ferrari Class : "+f.average());
        Car b = new Benz();
        System.out.println("Benz Class : "+b.average());  
    }    
}