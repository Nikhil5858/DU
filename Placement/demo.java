public class demo {
    public static void main(String[] args) {

        String s = "{[((([[{}]])))]}";
        int square = 0;
        int round = 0;
        int curly = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '[':
                    square++;
                    break;
                case '{':
                    curly++;
                    break;
                case '(':
                    round++;
                    break;
                case ']':
                    square--;
                    break;
                case '}':
                    curly--;
                    break;
                case ')':
                    round--;
                    break;
                default:
                    System.out.println("Invalid Character");
                    return;
            }
            if (square < 0 || round < 0 || curly < 0) {
                System.out.println("Invalid");
                return;
            }
        }
        if (square == 0 && round == 0 && curly == 0) {
            System.out.println("Valid");
        }
    }
}
