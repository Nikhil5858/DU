import java.util.*;
public class first{
    public static void main(String[] args) {
        int vowel = 0;
        int consonet = 0;
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String arrlength = sc.nextLine();
        for(int i=0;i<arrlength.length();i++){
            if (arrlength.charAt(i) == 'a' ||arrlength.charAt(i) == 'A'|| arrlength.charAt(i) == 'e'|| arrlength.charAt(i) == 'E' || arrlength.charAt(i) == 'i' || arrlength.charAt(i) == 'I' || arrlength.charAt(i) == 'o' || arrlength.charAt(i) == 'O' || arrlength.charAt(i) == 'u' || arrlength.charAt(i) == 'U') {
                vowel ++;                
            }
            else{
                consonet ++;
            }
        }
        System.out.println("String Have Vowels "+vowel+" And "+consonet+" Consonent");
        sc.close();
    }
}