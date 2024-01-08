package Level_1;
public class PeakEleOfAdjuscent {
    public static void getEle(int[] a) {
        int n = a.length;

        if (n == 1) {
            System.out.println(a[0]);
        }
        if (a[0] >= a[1]) {
            System.out.println(a[0]);
        }
        if (a[n - 1] >= a[n - 2]) {
            System.out.println(a[n - 1]);
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] >= a[i - 1] && a[i] >= a[i + 1]) {
                System.out.println(a[i]);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 50,40,30,20,12,10,90,9};
        getEle(arr);

    }
}
