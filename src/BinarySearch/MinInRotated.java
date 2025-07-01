package BinarySearch;

public class MinInRotated {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        System.out.println(FindMinInRotatedSortedArr(arr));
    }

    static int FindMinInRotatedSortedArr(int[] arr) {
        if (arr.length == 0) return -1;
        int start = 0;
        int end = arr.length - 1;

        // If array is not rotated
        if (arr[start] <= arr[end]) {
            return arr[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid+1 is minimum
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }

            // Check if mid is minimum
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return arr[mid];
            }

            // Decide the side to move
            if (arr[mid] >= arr[start]) {
                // Minimum is in right half
                start = mid + 1;
            } else {
                // Minimum is in left half
                end = mid - 1;
            }
        }

        return -1; // should never be hit if input is valid rotated sorted array
    }
}
