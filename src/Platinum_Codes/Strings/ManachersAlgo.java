    package Platinum_Codes.Strings;

    // Longest Palindromic Substring using Manacher’s Algorithm
    public class ManachersAlgo {
        public static void main(String[] args) {
            System.out.println(manachers("ABCAB"));
            System.out.println(longestPalindrome("ABCAB"));
        }

        // Returns length of longest palindromic substring
        static int manachers(String str) {
            int n = 2 * str.length() + 3;
            char[] schar = new char[n];
            schar[0] = '@';
            schar[n - 1] = '&';
            int t = 1;

            // Insert # and original characters
            for (int i = 0; i < str.length(); i++) {
                schar[t++] = '#';
                schar[t++] = str.charAt(i);
            }
            schar[t] = '#';

            int[] p = new int[n];
            int center = 0, right = 0;
            int maxlen = 0;

            // Core Manacher’s algorithm
            for (int i = 1; i < n - 1; i++) {
                int mirror = 2 * center - i;

                if (i < right) {
                    p[i] = Math.min(right - i, p[mirror]);
                }

                // Expand around center i
                while (schar[i + p[i] + 1] == schar[i - p[i] - 1]) {
                    p[i]++;
                }

                // Update center and right boundary if expanded beyond
                if (i + p[i] > right) {
                    center = i;
                    right = i + p[i];
                }

                maxlen = Math.max(maxlen, p[i]);
            }

            return maxlen;
        }

        // Returns the actual longest palindromic substring
        static String longestPalindrome(String str) {
            int n = 2 * str.length() + 3;
            char[] schar = new char[n];
            schar[0] = '@';
            schar[n - 1] = '&';
            int t = 1;

            for (int i = 0; i < str.length(); i++) {
                schar[t++] = '#';
                schar[t++] = str.charAt(i);
            }
            schar[t] = '#';

            int[] p = new int[n];
            int center = 0, right = 0;
            int maxlen = 0, maxcenter = 0;

            for (int i = 1; i < n - 1; i++) {
                int mirror = 2 * center - i;

                if (i < right) {
                    p[i] = Math.min(right - i, p[mirror]);
                }

                while (schar[i + p[i] + 1] == schar[i - p[i] - 1]) {
                    p[i]++;
                }

                if (i + p[i] > right) {
                    center = i;
                    right = i + p[i];
                }

                if (p[i] > maxlen) {
                    maxlen = p[i];
                    maxcenter = i;
                }
            }

            int start = (maxcenter - maxlen) / 2; // map back to original string index
            return str.substring(start, start + maxlen);
        }
    }
