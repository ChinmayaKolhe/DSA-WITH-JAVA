package Platinum_Codes;

public class EditDistance {
    public static void main(String[] args) {
        String str1="horse";
        String str2="ros";
        System.out.println(minDistance(str1,str2));
    }
    //Recursion

//    static int editDistance(String word1,String word2){
//        return editDistanceDP(word1,word2,word1.length(),word2.length());
//    }
//    static int editDistanceDP(String word1,String word2,int len1,int len2){
//        if(len1==0) return len2;
//        if(len2==0) return len1;
//        if(word1.charAt(len1-1)==word2.charAt(len2-1)){
//            return editDistanceDP(word1,word2,len1-1,len2-1);
//        }
//        return 1+Math.min(editDistanceDP(word1,word2,len1-1,len2-1),
//                Math.min(editDistanceDP(word1,word2,len1-1,len2),editDistanceDP(
//                        word1,word2,len1,len2-1)));
//
//    }

    //Memoization
    public static int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return editDistance(word1, word2, word1.length(), word2.length(), dp);
    }

    static int editDistance(String s1, String s2, int l1, int l2, int[][] dp) {
        if (l1 == 0) return l2;
        if (l2 == 0) return l1;

        if (dp[l1][l2] != -1) {
            return dp[l1][l2];
        }

        if (s1.charAt(l1 - 1) == s2.charAt(l2 - 1)) {
            return dp[l1][l2] = editDistance(s1, s2, l1 - 1, l2 - 1, dp);
        }

        return dp[l1][l2] = 1 + Math.min(editDistance(s1, s2, l1 - 1, l2 - 1, dp),
                Math.min(
                        editDistance(s1, s2, l1 - 1, l2, dp),
                        editDistance(s1, s2, l1, l2 - 1, dp)
                )
        );

    }
}
