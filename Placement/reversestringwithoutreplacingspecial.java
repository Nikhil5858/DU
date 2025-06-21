public class reversestringwithoutreplacingspecial {
    public static void main(String[] args) {
        
        String s = "a!!!b.c.d,e@f,ghi";
        String r = "";
        for (int i = s.length()-1; i >=0; i--) {
        
            r += s.charAt(i);
        }
        System.out.println(r); 
    }
}
