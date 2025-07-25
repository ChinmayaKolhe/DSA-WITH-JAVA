package Platinum_Codes;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={2,3,5,8,11,22};
        int target=5;
        System.out.println("Target "+target+" found at:"+BS(arr,target));
    }
    static int BS(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+(end-start)/2);
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return 0;
    }
}
