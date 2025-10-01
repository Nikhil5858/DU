import java.util.Arrays;

public class Kaprekar {
    public static void main(String[] args) {
        int num = 45;
        int numsq = num * num;

        int temp = numsq;
        int ans[] = new int[4];
        int index = 0;
        while (temp != 0) {
            int a = temp % 10;
            ans[index++] += a;
            temp = temp / 10;
        }

        int start = 0;
        int end = ans.length - 1;

        while (start < end) {
            int demo = ans[start];
            ans[start] = ans[end];
            ans[end] = demo;
            start++;
            end--;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();

        

    }
}
