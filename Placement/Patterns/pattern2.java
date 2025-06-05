//  123456789 
// 1    *****
// 2   *   * 
// 3  *   *
// 4 *   *
// 5***** 
public class pattern2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j2 = i; j2 < 5; j2++) {
                System.out.print(" ");
            }
            System.out.print("*"); 
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}