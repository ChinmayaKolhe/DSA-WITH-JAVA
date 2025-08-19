package Platinum_Codes;

public class MaximumAdjacentDiff {
    public static void main(String[] args) {
        int [] arr={2,1,11,4,8,20};
        System.out.println(MaxAdjDiff(arr));
    }
    static int MaxAdjDiff(int[]arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int range=max-min+1;
        int [] newarr=new int[range];
        for(int i=0;i<n;i++){
            newarr[arr[i]-min]++;
        }
        int diff=0;
        int left=-1;
        for(int i=0;i<range;i++){
            if(left==-1 && newarr[i]!=0){
                left=i;
            }
            else if(newarr[i]!=0){
                int tempdiff=i-left;
                if(tempdiff>diff){
                    diff=tempdiff;
                }
                left=i;
            }
        }
        return diff;
    }
}
