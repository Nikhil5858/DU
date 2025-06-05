
public class mergeandfindelementindex {

    public static void main(String[] args) {

        int array1[] = { 2, 3, 6, 7, 9 };
        int array2[] = { 1, 4, 8, 10 };

        int array3[] = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                array3[k++] = array1[i++];
            } else {
                array3[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            array3[k++] = array1[i++];
        }
        while (j < array2.length) {
            array3[k++] = array2[j++];
        }
        for (int a : array3) {
            System.out.print(a + " ");
        }

        System.out.println();
        int num = 10;
        for (int l = 0; l < array3.length; l++) {
            if (array3[l] == num) {
                System.out.println(l+1);
            }
    }
    }
}