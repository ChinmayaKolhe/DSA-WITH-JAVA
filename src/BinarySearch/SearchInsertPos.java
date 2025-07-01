package BinarySearch;

public class SearchInsertPos {
    public static void main(String[] args) {
        int[]arr={1,3,5,8};
        int target=9;
        System.out.println(InsertPos(arr,target));
    }
    static int InsertPos(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(arr.length==0){
            return 0;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
