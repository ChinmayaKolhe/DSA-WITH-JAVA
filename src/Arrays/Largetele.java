package Arrays;

public class Largetele {
    static int largestElement(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr={10,20,30,40,5};
        System.out.println(largestElement(arr));
    }
}
