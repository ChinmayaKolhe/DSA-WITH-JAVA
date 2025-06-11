package LinearSearch;
//return how many elements from the array contains an even no of digits...
//nums={12,345,56,1} o/p=2   (12 & 56 contains even no of digits)
public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums={12,345,6,234,34};
        int finalcount=findNumbers(nums);
        System.out.println("Numbers with eve no of digits contained="+finalcount);
    }

    private static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int noofdigits=Digits(num);
        if(noofdigits%2==0){
            return true;
        }
        return false;
    }

    private static int Digits(int num) {
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return -1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}
