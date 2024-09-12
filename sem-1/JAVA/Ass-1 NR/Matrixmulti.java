import java.util.Scanner;

public class Matrixmulti {

    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers for Matrix A: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Enter number for A[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter numbers for Matrix B: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Enter number for B[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result of Matrix A x Matrix B: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
