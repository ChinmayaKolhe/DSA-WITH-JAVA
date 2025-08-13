package Platinum_Codes;
import java.util.ArrayList;
import java.util.List;
public class FindAllAnagrams {
    public static void main(String[] args) {
        String s="cbaebabacd";
        String p="abc";
        System.out.println(FindAnagrams(s,p));
    }
    static List<Integer> FindAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;

        int[] freq = new int[26];
        for (char ch : p.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0, right = 0;
        int charsToMatch = p.length();
        while(right<s.length()){
            if(freq[s.charAt(right)-'a']-->0){
                charsToMatch--;
            }
            if(right-left+1==p.length()){
                if(charsToMatch==0){
                    res.add(left);
                }
                if(freq[s.charAt(left)-'a']++>=0){
                    charsToMatch++;
                }
                left++;
            }
            right++;
        }
        return res;
    }
}
