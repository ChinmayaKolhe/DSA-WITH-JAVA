package Platinum_Codes;

public class SumOfArrayBetLandR {
    //arr[]={1,2,3,4,5,6}
    //arr[][]={{1,6},{2,4},{4,5},{1,5}};
    //output= 21 9 9 15
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int [][]arr2={{1,6},{2,4},{4,5},{1,5}};
        int prefix[]=new int[arr.length+1];
        prefix[1]=arr[0];
        for(int i=2;i<=arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        for(int i=0;i<arr2.length;i++){
            int L=arr2[i][0];
            int R=arr2[i][1];
            System.out.println(prefix[R]-prefix[L-1]);
        }
    }
}
