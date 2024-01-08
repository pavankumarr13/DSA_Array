import java.util.Arrays;

public class Sort_0_1_2_Array {
    static int[] sort(int[] a) {
        int l = 0, m = 0;
        int h = a.length - 1;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[m] == 0) {
                temp = a[m];
                a[m] = a[l];
                a[l] = temp;
                l++;
                m++;
            } else if (a[m] == 1) {
                m++;
            } else {
                temp = a[h];
                a[h] = a[m];
                a[m] = temp;
                h--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        System.out.println(Arrays.toString(sort(a)));
    }
}
