public class strrev{
    public static void main(String[] args) {
    
        String s = "Nikhil";
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }
        System.out.println(s2);
        // StringBuilder sb = new StringBuilder(s).reverse();
        // System.out.println(sb);
    }
}