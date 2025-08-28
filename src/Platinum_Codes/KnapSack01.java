package Platinum_Codes;
//
//public class KnapSack01 {
//    public static void main(String[] args) {
//        int[] pr = {40, 50, 120};
//        int[] wt = {4, 8, 16};
//        int n = pr.length;
//        int sack = 24;
//        System.out.println(knapsack(sack, pr, wt, n));
//    }
//
//    static int knapsack(int s, int pr[], int wt[], int n) {
//        if (n == 0 || s == 0) return 0;
//        if (wt[n - 1] > s) {
//            return knapsack(s, pr, wt, n - 1);
//        }
//        else {
//            return Math.max(
//                    pr[n - 1] + knapsack(s - wt[n - 1], pr, wt, n - 1),
//                    knapsack(s, pr, wt, n - 1)
//            );
//        }
//    }
//}

//dynamic programming
public class KnapSack01 {
    public static void main(String[] args) {
        int[] pr = {40, 50, 120};
        int[] wt = {4, 8, 16};
        int n = pr.length;
        int sack = 24;
        int [][] dp=new int[n+1][sack+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sack; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsackDP(sack, pr, wt, n,dp));
    }

    static int knapsackDP(int s, int[] pr, int[] wt, int n,int dp[][]) {
        if (n == 0 || s == 0) return 0;

        if(dp[n][s]!=-1){
            return dp[n][s];
        }
        if (wt[n - 1] > s) {
            return dp[n][s]=knapsackDP(s, pr, wt, n - 1,dp);
        }
        else{
            return dp[n][s]=Math.max(
                    pr[n - 1] + knapsackDP(s - wt[n - 1], pr, wt, n - 1,dp),
                    knapsackDP(s, pr, wt, n - 1,dp)
            );
        }
    }

    //Tabulation
    static int knapsackT(int s,int wt[],int pr[],int n){
        int dp[][]=new int[n+1][s+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=s;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                } else if (wt[i-1]<=j) {
                    dp[i][j]=Math.max(dp[i-1][j],pr[i-1]+dp[i-1][j-wt[i-1]]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][s];
    }
}


