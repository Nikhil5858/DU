public class Practicalr5B5 {

    public static void main(String[] args) {
        complex p2 = new complex();
        complex p = new complex(20,30);
        p.add(p2); 
    }    
}

class complex{
    float real,img;

    complex(){
        real = 10;
        img = 15;
    }

    complex(float real , float img){
        this.real = real;
        this.img = img;
    }
    void add(complex c2){
        complex c3 = new complex();
        c3.real = this.real + c2.real;
        c3.img  = this.img + c2.img;
        System.out.println("Sum of :"+c3.real+" + "+c3.img);
    }
}