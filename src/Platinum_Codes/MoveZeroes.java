package Platinum_Codes;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int left=0;
        for(int right=0;right<nums.length;right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
}
