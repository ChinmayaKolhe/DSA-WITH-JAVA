package Platinum_Codes;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArrays {
    public static void main(String[] args) {
        int [] arr1={1,2,2,1};
        int[] arr2={1,2,2};
        HashSet<Integer> s1=new HashSet<Integer>();
        HashSet<Integer> s2=new HashSet<Integer>();
        for(int nums:arr1){
            s1.add(nums);
        }
        for(int num:arr2){
            if(s1.contains(num)){
                s2.add(num);
            }
        }
        int [] ans=new int[s2.size()];
        int i=0;
        for(int num:s2){
            ans[i++]=num;
        }
        for(i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
