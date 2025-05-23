import java.util.Scanner;
public class PrintNums1ToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        for (int num=1;num<=n;num+=1){
            System.out.print(num + " ");
        }
    }
} 