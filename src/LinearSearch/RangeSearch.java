package LinearSearch;

public class RangeSearch {
    public static void main(String[] args) {
        int[] nums={2,5,4,89,3,45,21};
        int target=3;
        int start=2;
        int end=5;
        System.out.println(RangeSearchLS(nums,target,start,end));
    }

    private static boolean RangeSearchLS(int[] nums, int target,int start,int end) {
        if(nums.length==0){
            return false;
        }
        for(int i=start;i<=end;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}
