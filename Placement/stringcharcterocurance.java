public class stringcharcterocurance {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Character c = 'e';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Count of " + c + " in " + s + " is : " + count);
    }
}
