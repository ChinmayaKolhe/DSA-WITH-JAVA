import java.util.Scanner;
public class LargestOfThreeSecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three nums:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = 0;
        if(a > b){
            max = a;
        } else {
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println("Largest:"+max);
    }
}


