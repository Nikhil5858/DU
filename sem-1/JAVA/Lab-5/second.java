public class second {
    public static void main(String[] args) {
        // First pyramid
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //second pyramid
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
