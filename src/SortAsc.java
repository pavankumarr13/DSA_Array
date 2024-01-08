import java.util.Arrays;

public class SortAsc {
    static int[] sort(int[] a) {
        int k = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = { 1, 32, 52, 15, 20, 34, 85 };

        System.out.println(Arrays.toString(sort(a)));
    }
}
