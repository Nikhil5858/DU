class stringpalidrone {
    public static void main(String[] args) {
        String abc = "aba";
        boolean isPalidrone = true;
        int length = abc.length();

        for (int i = 0; i < length / 2; i++) {
            if (abc.charAt(i) != abc.charAt(length - 1 - i)) {
                isPalidrone = false;
                break;
            }
        }

        if (isPalidrone) {
            System.out.println("Palidrone");
        } else {
            System.out.println("Not Palidrone");
        }
    }
}
