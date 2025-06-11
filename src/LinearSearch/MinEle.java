package LinearSearch;

public class MinEle {
    public static void main(String[] args) {
        int []nums={23,45,10,34,3,23,56};
        System.out.println("Minimum="+FindMin(nums));
    }

    private static int FindMin(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}
