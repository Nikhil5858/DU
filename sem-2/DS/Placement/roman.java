import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        System.out.println("Enter number 1 and 100: ");
        int input = sc.nextInt();

        if (input >= 1 && input <= 100) {
            String roman = "";

            if (input == 100) {
                System.out.println("C");
            } else {
                roman += tens[input / 10]; // 42 / 10 = 4 then xl  =====  roman string added this first from tens array
                roman += units[input % 10]; // 42 % 10 = 2 then ii =====  roman string added xl + ii from units array
            }
            System.out.println("Roman numeral: " + roman);
        }
    }
}