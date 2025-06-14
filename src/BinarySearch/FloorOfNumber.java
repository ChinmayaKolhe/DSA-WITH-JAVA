package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,9,13,14,17,19};
        int target=15;
        int ans=flooring(arr,target);
        System.out.println("Element ="+ans);
    }

    private static int flooring(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            } else if (target<arr[mid]) {
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
        }
        return arr[end];

    }

}
