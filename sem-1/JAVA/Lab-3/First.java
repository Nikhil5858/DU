import java.util.*;

public class First{
    public static void main(String args[]){
   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 Subject Marks");
        int sub1 = sc.nextInt();
        System.out.println("Enter 2 Subject Marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter 3 Subject Marks");
        int sub3 = sc.nextInt();
        System.out.println("Enter 4 Subject Marks");
        int sub4 = sc.nextInt();
        System.out.println("Enter 5 Subject Marks");
        int sub5 = sc.nextInt();

        double total = sub1+sub2+sub3+sub4+sub5;
        double percentage = total/500*100;

        System.out.println("Total Marks Out of 500 : "+total);

        if (percentage >= 60) {
            System.out.println("First Division");
        }
        else if(percentage >50 && percentage <59){
            System.out.println("Second Division");
        }
        else if(percentage >40 && percentage <49){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Failed");
        }
        sc.close();
    }
}