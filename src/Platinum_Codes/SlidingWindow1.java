package Platinum_Codes;

public class SlidingWindow1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int w = 3;
        System.out.println(SubArraySum(arr, w));
    }

    static int SubArraySum(int[] arr, int w) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i <= n - w; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = i; j < i + w; j++) {
                if (arr[j] < min) min = arr[j];
                if (arr[j] > max) max = arr[j];
            }

            sum += min + max;
        }

        return sum;
    }
}
