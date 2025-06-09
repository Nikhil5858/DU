public class diffofsecondlargeandsmall {
    public static void main(String[] args) {
        int array[] = {54, 6, 19, 67, 13, 46};

        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondmin = min;
                min = array[i];
            } else if (array[i] < secondmin && array[i] != min) {
                secondmin = array[i];
            }
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondmax = max;
                max = array[i];
            } else if (array[i] > secondmax && array[i] != max) {
                secondmax = array[i];
            }
        }

        System.out.println("Second min : " + secondmin);
        System.out.println("Second large : " + secondmax);
        System.out.println("Difference of second large and second small : " + (secondmax - secondmin));
    }
}
