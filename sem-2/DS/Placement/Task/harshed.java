public class harshed {
    public static void main(String[] args) {
        
        int num = 21;
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int b = temp % 10;
            sum = sum + b;
            temp = temp / 10;
        }

        System.out.println(sum);
        if (num % sum == 0) {
            System.out.println("Number is Harshed");
        }
        else{
            System.out.println("Number is not Harshed");
        }

    }
}
