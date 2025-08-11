package Platinum_Codes;

public class RearrangeByItsSign {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int[] arr=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[pos]=nums[i];
                pos+=2;
            }
            else{
                arr[neg]=nums[i];
                neg+=2;
            }
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
