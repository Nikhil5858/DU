class Bike{
    final void run(){
        System.out.println("Bike Running");
    }
}

class Honada extends Bike{
    void run(){
        System.out.println("Honda Running");
    }
}

public class Four {
    public static void main(String[] args) {
        Honada h = new Honada();
        h.run();
    }
}
