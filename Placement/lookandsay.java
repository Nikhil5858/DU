public class lookandsay {
    public static void main(String[] args) {

        String s = "1121221";
        int count = 1;
        String result = "";

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result += count + "" + s.charAt(i - 1);
                count = 1;
            }
        }
        result += count + "" + s.charAt(s.length() - 1);
        System.out.println(result);
    }
}
