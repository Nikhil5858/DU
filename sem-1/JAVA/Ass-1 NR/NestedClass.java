public class NestedClass {

    public static void main(String[] args) {
        Democlass1 d1 = new Democlass1();
        d1.outMeth();
    }
}


class Democlass1{
    private int a = 10;
    int b = 10;

    void outMeth(){
        System.out.println("Outer Method (a+b): "+(a+b));
        Democlass2 d2 = new Democlass2();
        d2.inerMeth();

    }
    class Democlass2{
        int c = 30;

        void inerMeth(){
            System.out.println("Inner Class Method (a+b+c): "+(a+b+c));
        }
    }
}