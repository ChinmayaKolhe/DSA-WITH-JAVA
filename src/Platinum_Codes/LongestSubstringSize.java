package Platinum_Codes;

import java.util.HashMap;

public class LongestSubstringSize {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(LengthOfLongestSubString(s));
    }

    static int LengthOfLongestSubString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0, start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }
            map.put(ch, i);
            maxlen = Math.max(maxlen, i - start + 1);
        }
        return maxlen;
    }
}
