package Platinum_Codes;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int []coins={2,7,12,5};
        int target=29;
        Arrays.sort(coins);
        System.out.println("Coins used to make " + target + ":");
        for (int i = coins.length - 1; i >= 0; i--) {
            while (target >= coins[i]) {
                System.out.println(coins[i]);
                target -= coins[i];
            }
        }
    }
}
