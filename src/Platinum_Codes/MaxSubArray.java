package Platinum_Codes;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] num={5,2,6,7,1,12,4};
        int n=num.length;
        int size=4;
        int windowSum=0;
        for(int i=0;i<size;i++){
            windowSum +=num[i];
        }
        int max=windowSum;
        for(int i=size;i<n;i++){
            windowSum+=num[i]-num[i-size];
            max=Math.max(max,windowSum);
        }

        System.out.println(max);
    }
}
