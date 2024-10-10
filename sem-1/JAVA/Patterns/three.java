// 1
// 12
// 123
// 1234

import java.util.*;
public class three{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    } 
}