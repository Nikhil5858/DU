public class pyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
            }
            for (int k = 1; k<=2*i-1; k++) {
            System.out.print("*");
            }
        System.out.println();
        }

        // upside down pyramid

        // for (int i = n-1; i >=1; i--) {
            // for (int j = 1; j <=n-i; j++) {
            // System.out.print(" ");
            // }
            // for (int k = 2*i-1; k>=1; k--) {
            // System.out.print("*");
            // }
        // System.out.println();
        // }


        //Hollow Pyramid

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int k = 1; k <= 2 * i - 1; k++) {
        //         if (k == 1 || i == n || k == 2 * i - 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

    }
}
