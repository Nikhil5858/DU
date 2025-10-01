public class pattern6 {

    public static void main(String[] args) {
        
        int n = 5;
        
        for (int i = 0; i <=n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i+1; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();            
        }
    }    
}