package Platinum_Codes;

public class BSRecursion {
    public static void main(String[] args) {
        int[]arr={2,3,5,8,11,22};
        int target=5;
        System.out.println("Target "+target+" found at:"+BS(arr,target,0,arr.length-1));
    }
    static int BS(int[]arr,int target,int start,int end){
            if(start>end) {
                return -1;
            }
            int mid=(start+(end-start)/2);
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                return BS(arr,target,mid+1,end);
            }
            else {
                return BS(arr, target, start, mid - 1);
            }
    }
}
