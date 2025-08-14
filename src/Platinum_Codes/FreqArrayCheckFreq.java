package Platinum_Codes;

import java.util.HashMap;

public class FreqArrayCheckFreq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 2, 3, 6, 7, 4, 2};
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
            //Or hm.put(arr[i],getOrDefault(arr[i],0)+1);  //instead using if else you can use this single line of code.
        }

        for (int key : hm.keySet()) {
            System.out.println(key + " -> " + hm.get(key));
        }
    }
}
