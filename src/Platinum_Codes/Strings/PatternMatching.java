package Platinum_Codes.Strings;

public class PatternMatching {
    public static void main(String[] args) {
        String str="ABCDEABAB";
        String pattern="AB";
        for(int i=0;i<str.length();i++){
            int temp=i;
            int j=0;
            for(j=0;j<pattern.length();j++){
                if(str.charAt(temp)==pattern.charAt(j)){
                    temp++;
                }
                else{
                    break;
                }
            }
            if(j==pattern.length()){
                System.out.print(i+",");
            }
        }
    }
}
