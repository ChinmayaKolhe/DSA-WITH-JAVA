package Sorting;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 3, 2};
        System.out.println(duplicatenum(arr)); // Output: [2, 3]
    }

    static List<Integer> duplicatenum(int[] arr) {
        int i = 0;

        // Cyclic sort pattern
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Collect duplicates
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 && !duplicates.contains(arr[index])) {
                duplicates.add(arr[index]);
            }
        }

        return duplicates;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
