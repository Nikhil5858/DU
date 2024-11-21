import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test extends IOException{

    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("demo.txt");
            BufferedReader b = new BufferedReader(f);
            // char c[] = new char[20];
            String line;

            if (b.ready()) {

                while((line = b.readLine()) != null) {
                    System.out.println(line);
                }

                // b.read(c);
                // for(int i=0;i<50;i++){
                //     System.out.print(c[i]);
                // }
            }
        } catch (Exception e) {
            e.toString();
        }
    }
}