package BinarySearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 3, 2, 1};
        System.out.println(PeakIndex(arr));
    }

    static int PeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return arr[start];
    }
}
