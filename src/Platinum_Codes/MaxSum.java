package Platinum_Codes;

public class MaxSum {
    public static void main(String[] args) {
        int []arr= {5, 7, 1, 8};
        System.out.println(maxSum(arr));
    }
    static int maxSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int max=arr[i]+arr[j];
                if(max>sum){
                    sum=max;
                }
            }
        }
        return sum;
    }
}
