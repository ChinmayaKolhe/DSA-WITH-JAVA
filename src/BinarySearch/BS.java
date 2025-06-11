package BinarySearch;

public class BS {


    public static void main(String[] args) {
        int[] nums={2,5,7,12,23,45,67,89,122,144,167,456};
        int target=167;
        System.out.println("Target found at="+BinarySearchM(nums,target));
    }

    private static int BinarySearchM(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
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
}
