// A number where the sum of the digits of its square equals the number itself.
// Input: 9 → Output: 9² = 81 → 8+1 = 9 (Neon)

public class neon {
    public static void main(String[] args) {
        int num = 9;
        int a = num * num;
        int temp = a;
        int sum = 0;

        while (temp != 0) {
            int b = temp % 10;
            sum = sum + b; 
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("Number is Neon");
        }
        else{
            System.out.println("Number is Not Neon");
        }
    }
}
