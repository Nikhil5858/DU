import java.util.Scanner;

public class StringLengthAndHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        int length = input.length();
        System.out.println("Length of string: " + length);

        int halfLength = length / 2;
        String secondHalf = input.substring(halfLength);
        System.out.println("Second half of string: " + secondHalf);
    }
}
