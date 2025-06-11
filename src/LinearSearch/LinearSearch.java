package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums={10,20,30,40,50,60};
        int search=20;
        int result=LinearSearch(nums,search);
        System.out.println("Number Found at:"+result);
    }
    static int LinearSearch(int[] arr,int target) {
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
