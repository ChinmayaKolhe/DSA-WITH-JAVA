package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,3,2,1};
        int target=5;
        System.out.println("Found at="+search(arr,target));
    }
    static int search(int[]arr,int target){
        int peak=PeakIndexInArray(arr);
        int firstTry=bs(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnostics(arr,target,peak+1,arr.length-1);
    }

    private static int bs(int[] nums, int target, int start, int end) {
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (target<nums[mid]) {
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }
        }
        return -1;
    }

    private static int orderAgnostics(int[] arr, int target, int start, int end) {
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

    private static int PeakIndexInArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
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
