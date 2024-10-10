// *
// **
// ***
// ****
// ***
// **
// *

import java.util.*;
public class four{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    } 
}