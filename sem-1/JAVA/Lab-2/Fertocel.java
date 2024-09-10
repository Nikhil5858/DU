// °C = (°F - 32) × 5/9;

import java.util.*;

public class Fertocel {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.println("Enter Fahrenheit = ");
        int fah = sc.nextInt();

        int ans = (fah - 32) * 5/9;
        System.out.println("Answer is : " + ans);

        // Celsius to Fahrenheit
        System.out.println("Enter Celsius = ");
        int cel = sc.nextInt();

        int ans2 = (cel * 9/5) + 32;
        System.out.println("Answer is : " + ans2);

        sc.close();
    }
}
