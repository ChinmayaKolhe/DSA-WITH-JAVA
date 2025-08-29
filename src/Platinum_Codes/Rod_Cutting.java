package Platinum_Codes;

public class Rod_Cutting {
    public static void main(String[] args) {
        int[] price={1,5,8,9,10,17,17,20};
        System.out.println(cutRod(price,0,price.length));
    }
    static int cutRod(int[] price,int index,int n) {
    //static int cutRod(int[] price,int n) {
//        if (n <= 0) {
//            return 0;
//        }
//
//        int max_val = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            max_val = Math.max(max_val, price[i] + cutRod(price, n - i - 1));
//        }
//
//        return max_val;
        if(n==0){
            return n*price[0];
        }
        int notCut=cutRod(price,index-1,n);
        int cut=Integer.MIN_VALUE;
        int rodLength=index+1;
        if(rodLength<=n){
            cut=price[index]+cutRod(price,index,n-rodLength);
        }
        return Math.max(notCut,cut);
    }

}

//dynamic programming

//public class Rod_Cutting {
//    public static void main(String[] args) {
//        int[] price={1,5,8,9,10,17,17,20};
//        System.out.println(cutRod(price));
//    }
//    static int cutRod(int[] price) {
//        int n = price.length;
//
//        int dp[] = new int[n + 1];
//
//        dp[0] = 0;
//
//        for (int i = 1; i <= n; i++) {
//            int max_val = Integer.MIN_VALUE;
//
//            for (int j = 0; j < i; j++) {
//                max_val = Math.max(max_val, price[j] + dp[i - j - 1]);
//            }
//
//            dp[i] = max_val;
//        }
//        return dp[n];
//    }
//}
