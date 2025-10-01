public class ButerflyPattern {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("1");
            }
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("2");
            }
            System.out.println();
        }

        for (int i = num; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("3");
            }
            for (int j = 0; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("4");
            }
            System.out.println();
        }
    }
}
