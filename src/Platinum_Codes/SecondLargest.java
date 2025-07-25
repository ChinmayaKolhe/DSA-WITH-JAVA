package Platinum_Codes;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[]arr={5,3,2,1,6};
        Arrays.sort(arr);
        int sec=arr.length-2;
        System.out.println(arr[sec]);
    }
}
