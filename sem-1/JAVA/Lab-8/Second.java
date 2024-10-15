interface A{
    int a = 10;
    void methodA();
}

interface A1 extends A{
    int b = 20;
    void methodA1();
}

interface A2 extends A{
    int c = 30;
    void methodA2();
}

interface A12 extends A1,A2{
    int d = 40;
    void methodA12();
}

class B implements A12{

    public void methodA(){
        System.out.println("Method A was Called : "+a);
    }
    public void methodA1(){
        System.err.println("Method A1 was Called : "+b);
    }
    public void methodA2(){
        System.out.println("Method A2 was Called : "+c);
    }
    public void methodA12(){
        System.out.println("Method A12 was Called : "+d);
    }
}

public class Second {
    public static void main(String[] args) {
        B b = new B();
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}
