package Platinum_Codes;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 2, 10, 1};

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);  // partition index
            quickSort(arr, low, pi - 1);         // left of pivot
            quickSort(arr, pi + 1, high);        // right of pivot
        }
    }

    // Pivot = first element
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];  // first element as pivot
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) i++;
            while (i <= j && arr[j] > pivot) j--;

            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Place pivot in correct position
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
