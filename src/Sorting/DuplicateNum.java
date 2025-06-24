package Sorting;

public class DuplicateNum {
    public static void main(String[] args) {
        int[]arr={1,3,2,4,3};
        System.out.println(duplicatenum(arr));
    }
    static int duplicatenum(int[] arr){
        int i=1;

        while(i<arr.length){
            int current=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[current]){

                swap(arr,i,current);
                
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return arr[index];
            }
        }

        return -1;

    }

    private static void swap(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
