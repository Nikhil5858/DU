import java.util.*;;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Element : ");
        int num = sc.nextInt();
        int sum =0;
        int[] Array = new int[num]; 
        
        for(int i=0;i<num;i++){
            System.out.println("Enter Array : "+i);
            Array[i] = sc.nextInt();
            sum += i;
        }
        double avg = sum/Array.length; 
        System.out.println("Average Of Your Given Elements : "+avg);
        sc.close();
    }
}
