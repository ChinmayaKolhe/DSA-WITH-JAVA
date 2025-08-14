package Platinum_Codes;

public class PrefixArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        for(int i=0;i<arr.length;i++){
//            int sum=0;
//            for(int j=0;j<=i;j++){
//                sum+=arr[j];
//            }
//            System.out.println(sum);
//        }
        //approach 2
        int res[]=new int[arr.length];
        res[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            res[i]=res[i-1]+arr[i];
        }
        for(int num:res){
            System.out.println(num);
        }
    }
}
