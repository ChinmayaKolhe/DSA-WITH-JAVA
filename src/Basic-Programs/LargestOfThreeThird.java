import java.util.Scanner;
public class LargestOfThreeThird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 nums:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = Math.max(c,Math.max(a,b));
        System.out.println("Largest:"+max);
    }
}
