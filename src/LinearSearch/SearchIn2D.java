package LinearSearch;

public class SearchIn2D {
    public static void main(String[] args) {
        int [][] nums={
                {2,3,4},
                {34,23,43},
                {56,1,34}
        };
        int target=23;
        System.out.println("Successfully found="+SearchIn2DArray(nums,target));
    }

    private static int SearchIn2DArray(int[][] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        for(int rows=0;rows<nums.length;rows++){
            for(int cols=0;cols<nums[rows].length;cols++){
                if(target==nums[rows][cols]){
                    return nums[rows][cols];
                }
            }
        }
        return -1;
    }
}
