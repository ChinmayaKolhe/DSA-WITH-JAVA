package Platinum_Codes;
import java.util.Arrays;
public class MissingNum {
    static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
}
