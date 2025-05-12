public class longestcommansubsequance {
    public static void main(String[] args) {
        String input1 = "nikhilrathod";
        String input2 = "nirathod";
        String answer = "";

        int index;
        for (int i = 0; i < input1.length(); i++) {
            index = i;
            String current = "";
            for (int j = 0; j < input2.length(); j++) {
                if (index < input1.length() && input1.charAt(index) == input2.charAt(j)) {
                    current += input2.charAt(j);
                    index++;
                }
            }
            if (current.length() > answer.length()) {
                answer = current;
            }
        }

        System.out.println(answer);
    }
}
