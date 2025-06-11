package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        //int[] arr = {12, 34, 45, 56, 78, 90, 100};
        int[] arr={90,89,78,45,23,12};
        int target = 78;
        System.out.println("Item found at=" + OrderAg(arr, target));
    }

    private static int OrderAg(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

