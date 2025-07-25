package Platinum_Codes;
import java.util.*;

public class ActivitiesWRTime {
    public static void main(String[] args) {
        int[] act = {1, 3, 0, 5, 8};
        int[] time = {2, 4, 7, 9, 9};
        int minTime = 20;

        int n = act.length;
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = act[i];
            activities[i][1] = time[i];
        }


        Arrays.sort(activities, (a, b) -> b[0] - a[0]);


        int totalTime = 0, sumAct = 0;
        ArrayList<Integer> selected = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int currAct = activities[i][0];
            int currTime = activities[i][1];

            if (totalTime + currTime <= minTime) {
                totalTime += currTime;
                sumAct += currAct;
                selected.add(currAct);
            }
        }

        // Output
        System.out.println("Selected Activities: " + selected);
        System.out.println("Total Activity Sum: " + sumAct);
        System.out.println("Total Time Used: " + totalTime);
    }
}
