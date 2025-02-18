// Perfect Number → A number whose sum of divisors (excluding itself) equals the number.
// Input: 6 → Output: (1+2+3) = 6 (Perfect)
// Input: 28 → Output: (1+2+4+7+14) = 28 (Perfect)

public class factorsum {
    public static void main(String[] args) {
        int num = 6;
        int temp = num;
        int sum = 0;
        for (int i = 1; i < temp; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println(sum + " is Harshed Number ");
        } else {
            System.out.println(sum + " is Not Harshed Number ");
        }
    }
}
