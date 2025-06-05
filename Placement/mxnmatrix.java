import java.util.Scanner;

public class mxnmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row : ");
        int row = sc.nextInt();
        System.out.println("Enter Column : ");
        int col = sc.nextInt();

        int [][] matrix = new int [row][col]; 

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter Element : Row "+i+" Column "+j);
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int[] hi : matrix) {
            for (int element : hi) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
