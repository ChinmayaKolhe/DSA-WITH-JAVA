import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three nums");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if(b>max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println("Maximum:"+max);
    }
} 