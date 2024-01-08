package Level_2;

import java.util.Arrays;

public class CyclicRotate {
    public static int[] rotate(int[] a, int r) {
        int[] temp = new int[a.length];
        int b = 0;
        for (int i = r; i < a.length; i++) {
            temp[i] = a[b++];
        }
        for (int i = 0; i < r; i++) {
            temp[i] = a[b++];
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int rotateBy = 3;

        System.out.println(Arrays.toString(rotate(a, rotateBy)));

    }
}
