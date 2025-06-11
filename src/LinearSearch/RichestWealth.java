package LinearSearch;

//m*n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
//Return the wealth that the customer has....

//customers wealth is the amount of money they have in all their bank acccounts the
//richest cust is the cust who has the max wealth.


public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,3,4},
                {34,2,1},
                {56,3,4}
        };
        System.out.println("Richest Total Wealth="+intMaxWealth(accounts));
    }

    private static int intMaxWealth(int[][] accounts) {
        if(accounts.length==0){
            return -1;
        }
        int maxsum=0;
        for(int person=0;person<accounts.length;person++){
            int rowsum=0;
            for(int account=0;account<accounts[person].length;account++){
                rowsum=rowsum+accounts[person][account];
            }
            if(rowsum>maxsum){
                maxsum=rowsum;
            }
        }
        return maxsum;

    }
}
