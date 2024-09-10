import java.util.*;

public class Choiceswitchcase {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter A Number : ");
            num[i] = sc.nextInt();
        }
        System.out.println("Choice Between 4 : ");
        System.out.println("1. Smallest Number\n2. Largest Number\n3. Sum all Numbers\n4. Average of all Numbers");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            int smallest = num[0];
            for(int i = 1; i < num.length; i++) {
                if(num[i] < smallest) {
                    smallest = num[i];
                }
            }
            System.out.println("Smallest Number: " + smallest);
            break;
                
            case 2:
            int largest = num[0];
                for(int i = 1; i < num.length; i++) {
                    if(num[i] > largest) {
                        largest = num[i];
                    }
                }
                System.out.println("Largest Number: " + largest);    
            break;

            case 3:
                int sum=0;
                for(int number : num){
                    sum +=number;    
                }
                System.out.println("Sum of all Numbers : " +sum);    
            break;

            case 4:
                int total = 0;
                for(int number : num){
                    total += number;
                }
                int avg = total/4;
                System.out.println("Average of all Numbers : " +avg);    
            break;
        
            default:
                System.out.println("Invalid choice. Please choose between 1 and 4.");
            break;
        }
        sc.close();
    }
}
