package Platinum_Codes.BackTracking;

public class Combinations {
    public static void main(String[] args) {
        String[] seaters={"B1","B2","G"};
        combination(seaters,0);
    }
    static void combination(String []arr,int index){
        if(index==arr.length) {
            if (!arr[1].equals("G")) {
                for (String s : arr) {
                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }
        for(int i=index;i<arr.length;i++){
             swap(arr,i,index);
             combination(arr,index+1);
             swap(arr,i,index);
        }
    }
    static void swap(String[] arr,int i,int index){
        String temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
}
