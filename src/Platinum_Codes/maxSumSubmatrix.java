package Platinum_Codes;

import java.util.TreeSet;

public class maxSumSubmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1},
                {0, -2, 3}
        };
        int k = 2;
        System.out.println(new maxSumSubmatrix().maxSumSubmatrix(matrix, k));
    }

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int res = Integer.MIN_VALUE;


        for (int left = 0; left < cols; left++) {
            int[] rowsum = new int[rows];
            for (int right = left; right < cols; right++) {

                for (int r = 0; r < rows; r++) {
                    rowsum[r] += matrix[r][right];
                }

                res = Math.max(res, maxSubArrayNoLargerThanK(rowsum, k));
                if (res == k) return k;
            }
        }
        return res;
    }

    private int maxSubArrayNoLargerThanK(int[] nums, int k) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        TreeSet<Integer> prefixSums = new TreeSet<>();
        prefixSums.add(0);

        for (int num : nums) {
            currSum += num;
            Integer target = prefixSums.ceiling(currSum - k);
            if (target != null) {
                max = Math.max(max, currSum - target);
            }
            prefixSums.add(currSum);
        }

        return max;
    }
}
