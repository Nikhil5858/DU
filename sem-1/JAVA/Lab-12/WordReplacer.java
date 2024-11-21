import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordReplacer {
    public static void main(String[] args) {
        String word1 = "is"; 
        String word2 = "are";
        

        try (BufferedReader reader = new BufferedReader(new FileReader("demo.txt"))) {
            StringBuilder modifiedContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                int countInLine = line.length() - line.replace(word1, "").length();
                
                line = line.replace(word1, word2);
                
                modifiedContent.append(line).append(System.lineSeparator());
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("demo.txt"))) {
                writer.write(modifiedContent.toString());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}