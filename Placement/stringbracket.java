public class stringbracket {
    public static void main(String[] args) {
        String s = "{)";
        int sq = 0;
        int ro = 0;
        int cl = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                    ro++;
                    break;
                case '[':
                    sq++;
                    break;
                case '{':
                    cl++;
                    break;
                case ')':
                    ro--;
                    break;
                case ']':
                    sq--;
                    break;
                case '}':
                    cl--;
                    break;
                default:
                    System.out.println("Invalid character");
                    return;
            }

            if (ro < 0 || sq < 0 || cl < 0) {
                System.out.println("Invalid");
                System.out.println("Square: " + sq + " Round: " + ro + " Curly: " + cl);
                return;
            }
        }

        if (ro == 0 && sq == 0 && cl == 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
            System.out.println("Square: " + sq + " Round: " + ro + " Curly: " + cl);
        }
    }
}