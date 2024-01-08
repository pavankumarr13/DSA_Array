public class KthSmallestEle {
    static int element(int[] a, int k) {
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        return a[k-1];
    }

    public static void main(String[] args) {
        int[] a = { 1, 20, 45, 32, 85, 10, 15, 19, 8, 85 };
        int k = 5;

        System.out.println(element(a, k));
    }
}
