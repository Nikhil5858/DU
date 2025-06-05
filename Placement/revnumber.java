public class revnumber {
    public static void main(String[] args) {
        
        int num = 4865;
        int rev = 0;

        while (num!=0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reversed Number is : "+ rev);
    }
}
