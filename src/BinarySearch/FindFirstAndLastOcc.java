package BinarySearch;
import java.util.Arrays;
public class FindFirstAndLastOcc {
    public static void main(String[] args) {
        int[] nums={5,6,7,7,8,8,8,9};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int start = Search(nums, target, true);
        int end = Search(nums, target, false);
        return new int[]{start, end};
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
