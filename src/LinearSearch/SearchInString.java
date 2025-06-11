package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String s1="Chinmaya";
        char target='m';
        System.out.println(SearchInString(s1,target));
    }
    static boolean SearchInString(String s, char c1){
        if(s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c1){
                return true;
            }
        }
        /*
         for(char ch:s.toCharArray()){
            if(ch==c1)
               return true;
         }
        */
        return false;
    }
}
