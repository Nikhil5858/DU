import java.util.Scanner;

public class Test{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int vowel = 0;
        int consonent = 0;

        String s = sc.nextLine();

        for(int i=0;i<s.length();i++){

           if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                   vowel ++;
           }
           else{
            consonent ++;
           }
        }
        System.out.println("Vowels:"+vowel+"/nConsonent:"+consonent);
    }
}