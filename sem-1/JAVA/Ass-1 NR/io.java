import java.io.FileOutputStream;

public class io {

    public static void main(String[] args) {
       
        try {

        FileOutputStream f = new FileOutputStream("demo.txt");
        int i = 0;
        for (i=0;i<=100;i++) {
            System.out.println(i);
        }
        String number = Integer.toString(i); 
        byte b[] = number.getBytes();
        f.write(b);
        f.close();
            
        } catch (Exception e) {
            e.toString();
        }
    }
}