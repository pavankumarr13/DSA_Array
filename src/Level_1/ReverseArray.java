package Level_1;
import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] a) {
        int[] temp = new int[a.length];
        int k = temp.length - 1;
        for (int i = 0; i < a.length; i++) {
            temp[k--] = a[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 46 };
        System.out.println(Arrays.toString(reverse(a)));
    }
}
