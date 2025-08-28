package Platinum_Codes.Strings;

public class PalindromicSubstring {
    public static void main(String[] args) {
        String s = "MAAM";
        System.out.println(longestPalindrome(s));
    }

    static String longestPalindrome(String s) {
        int n = 2 * s.length() + 3;
        char[] chars = new char[n];
        chars[0] = '@';
        chars[n - 1] = '%';
        int t = 1;

        for (int i = 0; i < s.length(); i++) {
            chars[t++] = '#';
            chars[t++] = s.charAt(i);
        }
        chars[t] = '#';

        int[] p = new int[n];
        int center = 0, right = 0;
        int maxLen = 0, maxCenter = 0;

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right) {
                if (p[mirror] < (right - i)) {
                    p[i] = p[mirror];
                } else {
                    p[i] = right - i;
                }
            }

            while (chars[i + p[i] + 1] == chars[i - p[i] - 1]) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}
