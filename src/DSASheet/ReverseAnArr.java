package DSASheet;

public class ReverseAnArr {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            swap(arr,left,right);
            left++;
            right--;
        }
        for(int num:arr){
            System.out.print(num+", ");
        }
    }
    static void swap(int []arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
