package BinarySearch;

public class SmallestGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters={'c','f','g'};
        char target='d';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
