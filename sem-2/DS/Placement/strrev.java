public class strrev{
    public static void main(String[] args) {
    
        String s = "Nikhil";
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }
        // for (int i = 0; i < s.length(); i++) {  
        //     s2 = s.charAt(i) + s2; 
        // }
        System.out.println(s2);
        // StringBuilder sb = new StringBuilder(s).reverse();
        // System.out.println(sb);
    }
}