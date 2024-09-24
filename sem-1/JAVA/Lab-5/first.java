public class first {

public static void main(String[] args) {
    String sc = "stream";
    for(int i=1;i<=sc.length();i++){
        for(int j=1;j<=i;j++){
            System.out.print(sc.substring(0, i));
            break;
        }
        System.out.println();
    }
}    
}