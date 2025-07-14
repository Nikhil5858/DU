public class jumpgame {
    public static void main(String[] args) {

        int[] array = { 3,2,1,0,4};

        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > start) {
                System.out.println("False");
                break;
            }
            if (i+array[i]>start) {
                start = i+array[i];
            }
            if (start>=array.length-1) {
                System.out.println("True");
                break;
            }
        }
    }
}
