public class charfind {
    public static void main(String[] args) {

        String s = "Welcome to the du in mca department";
        int count = s.length() - s.replace("e", "").length();
        System.out.println("Number of 'e' is : "+count);
    }
}
