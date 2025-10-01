public class FancyTrianglePatern {
    public static void main(String[] args) {
        int num = 5;

        for (int i = num; i >= 0; i--) {
            for (int j = num; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >=0; k--) {
                System.out.print("*   ");
            }
            System.out.println();
        }

        // for (int i = 0; i <=num; i++) {
        //     for (int j = num; j >= i; j--) {
        //         System.out.print("  ");
        //     }
        //     for (int k = 0; k <=i; k++) {
        //         System.out.print("*   ");
        //     }
        //     System.out.println();
        // }
    }
}
