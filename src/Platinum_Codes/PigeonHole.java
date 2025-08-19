package Platinum_Codes;

public class PigeonHole {
    public static void main(String[] args) {
        int k=13,n=12;
        System.out.println(minObject(n,k));
    }
    static int minObject(int n,int k){
        if(n==0) return 0;
        int minObject=(k/n)+1;    //=(k+n-1)/n
        return minObject;
    }
}
