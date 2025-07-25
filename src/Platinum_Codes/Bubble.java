package Platinum_Codes;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {9, 2, 1, 5, 3};
        int[] sort = bubble(arr);
        System.out.println(Arrays.toString(sort));
    }

    static int[] bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

