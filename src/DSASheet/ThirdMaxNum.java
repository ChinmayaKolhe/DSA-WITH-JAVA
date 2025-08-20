package DSASheet;

public class ThirdMaxNum {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        System.out.println(thirdMax(arr));
    }
    static int thirdMax(int[] arr) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        for (int num : arr) {
            if ((max1 != 0 && num == max1) ||
                    (max2 != 0 && num == max2) ||
                    (max3 != 0 && num == max3)) {
                continue;
            }
            if (max1 == 0 || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == 0 || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == 0 || num > max3) {
                max3 = num;
            }
        }

        return (max3 == 0) ? max1 : max3;
    }
}
