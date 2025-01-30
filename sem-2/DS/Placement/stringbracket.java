public class stringbracket {
    public static void main(String[] args) {
        
        String s = "()()(){[])}";
        int sq = 0;
        int ro = 0;
        int cl = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                ro++;
            }
            else if(ch == ')'){
                ro--;
            }
            else if(ch == '['){
                sq++;
            }
            else if(ch == ']'){
                sq--;
            }
            else if(ch == '{'){
                cl++;
            }
            else if(ch == '}'){
                cl--;
            }
            else{
                System.out.println("Invalid");
                return;
            }

        }

        if (ro < 0 || sq < 0 || cl < 0) {
            System.out.println("Invalid");
            System.out.println("Square : "+sq+" Round : "+ro+" Curly : "+cl);
            return;
        }

        if (ro == 0 && sq == 0 && cl == 0) {
            System.out.println("Valid");
        }
    }
}
