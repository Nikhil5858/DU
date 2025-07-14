
public class mergeandfindelementindex {

    public static void main(String[] args) {

        int array1[] = { 2, 3, 6, 7, 9 };
        int array2[] = { 1, 4, 8, 10 };

        int array3[] = new int[array1.length + array2.length];

        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[index++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[index++] = array2[i];
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[i] > array3[j]) {
                    int temp = array3[i];
                    array3[i] = array3[j];
                    array3[j] = temp;
                }
            }
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        int k = 5;
        System.out.println("Element Find k = 5 : " + array3[k - 1]);
    }
}