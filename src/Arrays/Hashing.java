package Arrays;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Precompute frequencies using hashing
        int[] hash = new int[13]; // Assuming numbers are in the range 0 to 12
        for(int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Step 3: Answer queries
        int q = sc.nextInt();
        while(q-- > 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }

        sc.close();
    }
}
