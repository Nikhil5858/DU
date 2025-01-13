public class arm{
    public static void main(String[] args) {
        int num = 372;
        int temp1 = num;
        int count = 0;

        while(temp1 != 0){
            temp1 = temp1 / 10;
            count ++ ;
        }

        int base = count;
        int temp2 = num;
        int rem = 0;
        int arms = 0;
        
        while(temp2 != 0 ){  
            rem = temp2 % 10;
            //  temp = 153  rem = 3 base = 3 mul = 1      mul 1 * 3 = 3    mul 3 * 3 = 9     mul 9 * 3 = 27                         
            int mul = 1;
            for (int i = 1; i <= base; i++) {
                mul = mul * rem;
            }
            arms = arms + mul;
            temp2 = temp2 / 10;
        }

        if (arms == num) {
            System.out.println("Number is Armstrong!");
        }
        else{
            System.out.println("Number Is Not Armstrong!");
        }
    }
}