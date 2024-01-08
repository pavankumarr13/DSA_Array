public class NoOfOccurence {
    static int countNumber(int[] arr, int a) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 2, 3, };
        int a = 2;

        System.out.println(countNumber(arr, a));
    }
}
