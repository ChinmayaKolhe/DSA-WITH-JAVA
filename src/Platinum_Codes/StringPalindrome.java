package Platinum_Codes;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="MADAM";
        int start=0;
        int end=str.length()-1;
        boolean isTrue=true;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                isTrue=false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isTrue);
    }
}
