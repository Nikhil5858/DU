public class fibonaci {
    public static void main(String[] args) {
        int num = 5;
        int num1=0;
        int num2=1;
        int fibo = 0;

        if (num < 1) {
            System.out.println(num1+" "+num2);
        }
        else{
            for (int i = 0; i < num; i++) {
                fibo = num1 + num2;
                System.out.println("Series is : "+fibo);
                num1 = num2;
                num2 = fibo;    
            }
        }
    }
}
