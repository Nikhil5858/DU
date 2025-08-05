public class findlowerandupperinstring {
    public static void main(String[] args) {
        String s = "Welcome to GeeksforGeeks";
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                lower++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}
