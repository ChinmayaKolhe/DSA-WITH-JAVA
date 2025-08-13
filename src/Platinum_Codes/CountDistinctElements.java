package Platinum_Codes;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[]arr={1,2,1,3,4,2,3};
        int w=4;
        int n= arr.length;
        CountDistinct(arr,n,w);
    }
    static void CountDistinct(int[] arr,int n,int w){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<w;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        for(int i=w;i<n;i++){
            int outgoing=arr[i-w];
            map.put(outgoing, map.get(outgoing) - 1);
            if (map.get(outgoing) == 0) {
                map.remove(outgoing);
            }
            int incoming=arr[i];
            map.put(incoming,map.getOrDefault(incoming,0)+1);
            list.add(map.size());
        }
        System.out.println(list);
    }
}
