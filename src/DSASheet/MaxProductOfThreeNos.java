package DSASheet;
import java.util.*;
public class MaxProductOfThreeNos {
    public static void main(String[] args) {
        int [] arr={4,2,3,1};
//        Arrays.sort(arr);
//        int product=1;
//        for(int i=arr.length-1;i>=arr.length-3;i--){
//            product=product*arr[i];
//        }
//        System.out.println(product);

        System.out.println(maximumProduct(arr));
    }

    public static int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);

    }
}
