package BinarySearch;

import java.util.Arrays;

public class CountOcc {
    public static void main(String[] args) {
        int[] nums={1,2,2,2,3,4,5};
        int target=2;
        System.out.println(searchRange(nums,target));

    }
    public static int searchRange(int[] nums, int target) {
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);
        int count= (end-start)+1;
        return count;
    }
    private static int Search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
