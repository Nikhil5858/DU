class circle{
    double pi = 3.14;
    int radious;
    
    void areaOfCircle(int radious,double pi){
        this.radious = radious;
        this.pi = pi;
    }
    void getter()
    {
        System.out.println(pi * radious * radious);
    }
}
    
public class first {        
        public static void main(String[] args) {
            circle c1 = new circle();
            c1.areaOfCircle(5, 3.14);
            c1.getter();
        }
}
    