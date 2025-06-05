public class longestvalueofstring {
    public static void main(String[] args) {
        String input = "AABCDEE";
        int temp = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    temp++;
                }
            }
        }
        System.out.println(temp);
    }
}
