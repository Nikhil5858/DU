import java.util.Scanner;

public class FerToCel {
    public static void main(String[] args) {
        // °C = (°F - 32) × 5/9;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fahrenheit  ");
        int f = sc.nextInt();
        //Temperature in degrees Fahrenheit (°F) = (Temperature in degrees Celsius (°C) * 9/5) + 32.
        // Temperature in degrees Celsius (°C) = (Temperature in degrees Fahrenheit (°F) - 32) * 5/9.
        
        int c = (f-32)*5/9 ;
        System.out.println("ans is :"+c);
    }
}
