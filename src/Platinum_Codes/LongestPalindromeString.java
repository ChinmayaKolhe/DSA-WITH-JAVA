package Platinum_Codes;

public class LongestPalindromeString {
    public static void main(String[] args) {
        String s1="abc";
        int maxLen=0;
        String longest="";
        for(int i=0;i<s1.length();i++){
            for(int j=i;j<s1.length();j++){
                String sub=s1.substring(i,j+1);
                if(isPalindrome(sub) && sub.length()>maxLen){
                    maxLen=sub.length();
                    longest=sub;
                }
            }
        }
        System.out.println("Longest Palindromic String="+longest);

    }

    private static boolean isPalindrome(String sub) {
        int l=0;
        int r=sub.length()-1;
        while(l<r){
            if(sub.charAt(l)!=sub.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
