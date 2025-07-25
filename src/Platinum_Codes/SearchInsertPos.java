package Platinum_Codes;

public class SearchInsertPos {
    public static void main(String[] args) {
        int[] arr={1,3,4,5};
        int target=2;
        System.out.println(SearchPos(arr,target));
    }
    static int SearchPos(int []arr,int target){
        int start=0;
        int end=arr.length;
        if(arr.length==0){
            return -1;
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
