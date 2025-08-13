package Platinum_Codes;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;

        k = k % n;
        reverseArr(arr, 0, n - 1);
        reverseArr(arr, 0, k - 1);
        reverseArr(arr, k, n - 1);

        for (int num : arr) {
            System.out.print(num+" ");
        }
    }

    static void reverseArr(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
