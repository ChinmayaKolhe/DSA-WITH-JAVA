package Platinum_Codes;
import java.util.Arrays;
public class MissingNum {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int sumofnums = 0;
        for (int i = 0; i < n; i++) {
            sumofnums += nums[i];
        }
        return sum - sumofnums;
    }

    public static void main(String[] args) {
        int[] nums={3,0,1,2};
        System.out.println(missingNumber(nums));
    }
}
