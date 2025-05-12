public class palidronestringcount {
    public static void main(String[] args) {
        String input = "Nikhil";
        int count = 0;
        int len = input.length();
        String concatstring = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {

                concatstring = "";
                concatstring += input.charAt(i);
                concatstring += input.charAt(j);
                concatstring += input.charAt(i);

                boolean isPalidrone = true;
                for (int k = 0; k < concatstring.length() / 2; k++) {
                    if (concatstring.charAt(k) != concatstring.charAt(concatstring.length() - 1 - k)) {
                        isPalidrone = false;
                        break;
                    }
                }
                if (isPalidrone) {
                    count++;
                }
                System.out.println(concatstring);
            }
        }
        System.out.println(count);
    }
}
