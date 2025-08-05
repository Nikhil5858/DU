public class arrangearraysepwithsymbol {
    public static void main(String[] args) {

        String s = "321";
        for (int i = s.length() - 1; i > 0; i--) {
            System.out.print(s.charAt(i) + "+");
        }
        System.out.println(s.substring(0, 1));
    }
}
