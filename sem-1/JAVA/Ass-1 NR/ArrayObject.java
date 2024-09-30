import java.util.*;
public class ArrayObject {

    static class Box{
        double height,width,depth;

        Box(double height,double width,double depth){
            this.height = height;
            this.width = width;
            this.depth = depth;
        }
        public void display(){
            double Volume = height * width * depth;
            System.out.println("Box ["+ (height + width + depth) +"]");
            System.out.println("Height : "+height);
            System.out.println("Width : "+width);
            System.out.println("Depth : "+depth);
            System.out.println("Volume : "+Volume);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of Boxes : ");
        int size = sc.nextInt();
        Box[] ba = new Box[size];

        double height,width,depth;

        for (int i = 0; i < ba.length; i++) {
            System.out.println("Enter Height : ["+i+"]");
            height = sc.nextDouble();
            System.out.println("Enter Width : ["+i+"]");
            width = sc.nextDouble();
            System.out.println("Enter Depth : ["+i+"]");
            depth = sc.nextDouble();

            ba[i] = new Box(height, width, depth);
        }
        for (int i = 0; i < ba.length; i++) {
            ba[i].display();
        }
        sc.close();
    }    
}