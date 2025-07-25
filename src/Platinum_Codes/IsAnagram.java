package Platinum_Codes;
import java.util.Arrays;
public class IsAnagram {
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s="anagm";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
