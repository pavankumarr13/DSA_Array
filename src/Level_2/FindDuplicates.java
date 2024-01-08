package Level_2;

public class FindDuplicates {
    static void duplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[Math.abs(a[i])] >= 0) {
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
            } else {
                System.out.print(Math.abs(a[i]) + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 6, 3, 6, 1 };
        duplicate(a);
    }
}
