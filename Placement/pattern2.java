public class pattern2 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print(3 + " ");
                } else if (i == 2 || i == 4 || j == 2 || j == 4) {
                    System.out.print(2 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}
