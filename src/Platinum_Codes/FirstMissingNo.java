package Platinum_Codes;

public class FirstMissingNo {
    public static void main(String[] args) {
        int[] arr={2,7,9,3,4,8};
        System.out.println(FirstMissing(arr));
    }
    static int FirstMissing(int[] arr){
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
        for(int i=0;i<range;i++){
            if(newarr[i]==0){
                return i+min;
            }
        }
        return -1;
    }
}
