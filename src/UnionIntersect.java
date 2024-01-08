import java.util.Set;
import java.util.TreeSet;

public class UnionIntersect {
    public static void main(String[] args) {
        Set<Integer> sUnion = new TreeSet<>();
        Set<Integer> sIntersect = new TreeSet<>();

        int[] a = { 2, 5, 6 };
        int[] b = { 4, 6, 8, 10 };

        for (int i = 0; i < a.length; i++) {
            sUnion.add(a[i]);
            for (int j = 0; j < b.length; j++) {
                if (a[i] != b[j]) {
                    sUnion.add(b[j]);
                }
            }
        }

        System.out.println("Union: " + sUnion);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    sIntersect.add(a[i]);
                }
            }
        }

        System.out.println("Intersection: " + sIntersect);

    }
}
