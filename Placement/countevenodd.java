public class countevenodd {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int even = 0;
        int odd = 0;

        while (temp !=0) {
            int rem = temp % 10;
            if (rem % 2 == 0) {
               even++;
            }
            else{
                odd++;
            }
            temp = temp/10;
        }
        System.out.println("Even Number is : "+even);
        System.out.println("Odd Number is : "+odd);
    }
}
