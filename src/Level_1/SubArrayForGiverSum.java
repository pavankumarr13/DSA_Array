package Level_1;
public class SubArrayForGiverSum {
    static void subArray(int[] arr, int sum) {
        
        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];
            if (currentSum == sum) {
                System.out.println("Subarray of sum " + sum + " is at index " + i);
                return;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    currentSum += arr[j];

                    if (currentSum == sum) {
                        System.out.println("SubArray of Sum " + sum + " is between indexes " + i + " & " + j);
                        return;
                    }
                }
            }

        }
        System.out.println("No SubArray found");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        int sum = 18;
        subArray(arr, sum);
    }
}
