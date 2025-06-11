import java.util.Scanner;

public class FibonacciSerie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Clearer prompts
        System.out.print("Enter the position (n): ");
        int n = in.nextInt();
        System.out.print("Enter the first number (a): ");
        int a = in.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = in.nextInt();

        // Edge cases
        if (n == 1) {
            System.out.println("The " + n + "th number is: " + a);
        } else if (n == 2) {
            System.out.println("The " + n + "th number is: " + b);
        } else {
            int count = 2;
            while (count < n) {
                int temp = b;
                b = b + a;
                a = temp;
                count++;
            }
            System.out.println("The " + n + "th number is: " + b);
        }
    }
}
