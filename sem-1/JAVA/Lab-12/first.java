import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class first extends IOException{

    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("demo.txt");
            BufferedReader b = new BufferedReader(f);
            char c[] = new char[20];
            int linecount =0,wordcount=0,charctercount=0;
            String st;

            st = b.readLine();
            while (st != null) {

                linecount++;

                String[] word = st.split(" ");

                wordcount = wordcount + word.length;
                for(int i=0;i<word.length;i++){
                    charctercount = charctercount + word[i].length();
                }                
                st= b.readLine();

                
            }
            System.out.println("Line Count : "+linecount);
            System.out.println("Word Count : "+wordcount);
            System.out.println("Char Count : "+charctercount);

        } catch (Exception e) {
            e.toString();
        }
    }
}