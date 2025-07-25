package Platinum_Codes;

public class FiboRecursion {
    public static void main(String[] args) {
        int n = 7;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
    static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
