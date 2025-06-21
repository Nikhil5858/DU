public class storewordinarray {
    public static void main(String[] args) {
        String s = "Thiss is demo dsf sdjdsj scjbs";
        int start = 0;
        String ar[] = new String[50];
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                String word = s.substring(start, i);
                ar[idx++] = word;
                start = i + 1;
            }
        }
        ar[idx++] = s.substring(start);

        for (int i = 0; i < idx; i++) {
            System.out.println(ar[i]);
        }
    }
}
