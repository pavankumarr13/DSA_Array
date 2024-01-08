package Level_2;

public class CountPairsWithGivenSum {
    static int countPairs(int[] a, int sum) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 1 };
        int sum = 2;
        System.out.println(countPairs(a, sum));
    }
}
