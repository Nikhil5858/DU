class A {
    protected int num1 = 10;
    protected int num2 = 20;

    void add() {
        System.out.println("Class A : " + (num1 + num2));
    }
}

// Class B (Child) extends A
class B extends A {
    int num3 = 2;

    void multi() {
        System.out.println("Class B : " + (num1 * num2 * num3));
    }
}

public class DemoInheritance {
    public static void main(String[] args) {
        B b = new B();
        b.add();
        b.multi();
    }
}
