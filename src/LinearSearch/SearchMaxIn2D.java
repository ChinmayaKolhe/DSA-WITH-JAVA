package LinearSearch;

public class SearchMaxIn2D {
    public static void main(String[] args) {
        int [][] nums={
                {2,3,4},
                {34,23,43},
                {56,1,34}
        };
        System.out.println("Maximum="+SearchMax(nums));
    }

    private static int SearchMax(int[][] nums) {
        if(nums.length==0){
            return -1;
        }
        int max=nums[0][0];
        for(int rows=0;rows<nums.length;rows++){
            for(int cols=0;cols<nums[rows].length;cols++){
                if(nums[rows][cols]>max){
                    max=nums[rows][cols];
                }
            }
        }
        return max;
    }
}
