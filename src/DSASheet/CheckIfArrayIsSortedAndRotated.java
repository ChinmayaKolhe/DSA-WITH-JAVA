package DSASheet;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int [] arr={3,4,5,1,2};
        int n=arr.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
            if(arr[n-1]>arr[0]){
                count++;
            }
        }
        if(count>1){
            System.out.println("Array is not sorted and rotated");
        }else{
            System.out.println("array is sorted and rotated");
        }
    }
}
