public class ExceptionHandel {
    public static void main(String[] args) {
     
        try{
            int arr[] = {1,2,3,4};
            System.out.println(arr[10]);
            int a = 10;
            int b = 0;
            System.out.println("Addition a/b : "+(a/b));
        }
        catch(ArithmeticException e){
            System.out.println("Error : "+e.toString());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : "+e.toString());
        }
        finally{
            System.out.println("This code will always Execute!");
        }
    }
}
