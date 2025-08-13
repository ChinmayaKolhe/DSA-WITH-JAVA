package BabbarProblems.Arrays;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int n= num.length;
        for(int i=0;i<n;i+=2){
            if(i+1<n){
                swap(num,num[i],num[i+1]);
            }
        }
        for(int ans:num){
            System.out.print(ans+" ");
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
