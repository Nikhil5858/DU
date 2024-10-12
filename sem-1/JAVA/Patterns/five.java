//        *
//      * *
//    * * *
//  * * * *

import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        for (int i = num; i >=1; i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=3-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}