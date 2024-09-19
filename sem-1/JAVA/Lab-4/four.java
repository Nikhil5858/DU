import java.util.*;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine(); 
        int length = input.length();
        System.out.println("Lenght of String : "+length);

        int halflength = length/2;
        String secondHalf = input.substring(halflength);

        System.out.println("Your Half String : "+secondHalf);
        sc.close();
    }
}
