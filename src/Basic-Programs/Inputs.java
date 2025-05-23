import java.util.Scanner;
public class Inputs{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the int");
        int rollno = input.nextInt();
        System.out.println(rollno);

        System.out.println("Enter the float");
        float salary=input.nextFloat();
        System.out.println(salary);

        System.out.println("Enter the String");
        String s1=input.next();  //- It will take one word input till a space occurs
        System.out.println(s1);

        System.out.println("Enter the Double");
        double wages=input.nextDouble();
        System.out.println(wages);

        System.out.println("Enter the String");
        String s2=input.nextLine();  //-- It will take all string input including space.
        System.out.println(s2);
    }
} 