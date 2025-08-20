package Platinum_Codes.Strings;

public class ZValue {
    public static void main(String[] args) {
        String str="ABCABD";
        String pat="AB";
        zValue(str,pat);
    }
    static void zValue(String str,String pat){
        String newStr=pat+"$"+str;
        int n=newStr.length();
        int zArray[]=new int[n];
        computeZArray(newStr,zArray,pat.length());
        for(int i=pat.length()+1;i<n;i++){
            if(zArray[i]==pat.length()){
                System.out.println(i-(pat.length()+1));
            }
        }
    }
    static void computeZArray(String str,int[] zArray,int len){
        for(int i=len+1;i<str.length();i++){
            while(str.charAt(zArray[i])==str.charAt(i+zArray[i])){
                zArray[i]++;
            }
        }
    }
}
