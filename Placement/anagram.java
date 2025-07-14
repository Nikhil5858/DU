public class anagram {

    public static void main(String[] args) {

        String s1 = "lkhnii";
        String s2 = "nikhil";
        int str1 = 0;
        int str2 = 0;
        Boolean flag = true;
        if (s1.length() != s2.length()) {
            System.out.println("False");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                for (int j = 0; j < s2.length(); j++) {
                    if (ch == s1.charAt(j)) {
                        str1++;
                    }
                    if (ch == s2.charAt(j)) {
                        str2++;
                    }
                }
                if (str1 != str2) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("Strinf is Anagram");
            } else {
                System.out.println("Strinf is Not Anagram");
            }

        }
    }
}