package Platinum_Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Knapsack {
    public static void main(String[] args) {
        int[] profit={120,100,60};
        int[] weights={17,13,8};
        int sack_weight=20;
        System.out.println(knapsack(sack_weight,profit,weights));
    }
    static double knapsack(int sack,int[] profit,int[] weight){
        double res=0;
        TreeMap<Double, List<Integer>> tmap=new TreeMap<>();
        for(int i=0;i< profit.length;i++){
            List<Integer> ll=new ArrayList<>();
            ll.add(profit[i]);
            ll.add(weight[i]);
            double temp=((double) profit[i]/weight[i]);
            tmap.put(temp,ll);
        }
        for(Map.Entry<Double,List<Integer>> entry: tmap.descendingMap().entrySet()){
            if(entry.getValue().get(1)<=sack){
                res+=entry.getValue().get(0);
                sack-=entry.getValue().get(1);
            }
            else{
                res=res+(sack*(entry.getValue().get(0)/entry.getValue().get(1)));

                break;
            }
        }
        return res;
    }
}
