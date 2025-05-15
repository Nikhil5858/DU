public class choclateproblem {
    public static void main(String[] args) {

        int array[] = { 1, 6, 74, 98, 62, 5, 45, 88 };
        int min = Integer.MAX_VALUE;
        int sum = 3;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length - sum; i++) {
            int diff = array[i + sum - 1] - array[i];
            if (diff < min) {
                min = diff;
            }
        }
        System.out.println(min);
    }
}
