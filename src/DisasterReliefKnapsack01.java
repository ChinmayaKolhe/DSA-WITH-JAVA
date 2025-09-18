import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DisasterReliefKnapsack01 {

    static class Item {
        String name;
        int weight;      // kg
        int value;       // utility units
        boolean divisible;
        int priority;    // 1 = highest priority

        Item(String name, int weight, int value, boolean divisible, int priority) {
            this.name = name;
            this.weight = weight;
            this.value = value;
            this.divisible = divisible;
            this.priority = priority;
        }

        double valuePerWeight() {
            return (double) value / (double) weight;
        }
    }

    static class Result {
        int totalValue;
        int totalWeight;
        List<Item> selected = new ArrayList<>();
    }

    // Sort by priority ascending, then value/weight descending (presentation only)
    static final Comparator<Item> PRIORITY_THEN_VPW = (a, b) -> {
        if (a.priority == b.priority) {
            return Double.compare(b.valuePerWeight(), a.valuePerWeight());
        }
        return Integer.compare(a.priority, b.priority);
    };

    static Result knapsack01(List<Item> items, int capacity) {
        // Sort for display and to mirror the original scenario's ordering
        Collections.sort(items, PRIORITY_THEN_VPW);

        System.out.println("\nSorted Items (by Priority, then Value/Weight):");
        System.out.printf("%-20s%-10s%-10s%-12s%-15s%-15s%n",
                "Item", "Weight", "Value", "Priority", "Value/Weight", "Type");
        for (Item it : items) {
            System.out.printf("%-20s%-10d%-10d%-12d%-15.2f%-15s%n",
                    it.name, it.weight, it.value, it.priority, it.valuePerWeight(),
                    it.divisible ? "Divisible" : "Indivisible");
        }

        int n = items.size();
        int[][] dp = new int[n + 1][capacity + 1];

        // Standard 0/1 knapsack DP on value
        for (int i = 1; i <= n; i++) {
            Item it = items.get(i - 1);
            for (int w = 0; w <= capacity; w++) {
                int skip = dp[i - 1][w];
                int take = (it.weight <= w) ? it.value + dp[i - 1][w - it.weight] : Integer.MIN_VALUE / 2;
                dp[i][w] = Math.max(skip, take);
            }
        }

        // Reconstruct selection
        int w = capacity;
        Result res = new Result();
        for (int i = n; i >= 1; i--) {
            if (dp[i][w] != dp[i - 1][w]) { // item i-1 was taken
                Item it = items.get(i - 1);
                res.selected.add(it);
                w -= it.weight;
            }
        }
        // Reverse to display in the sorted order they appeared
        Collections.reverse(res.selected);

        // Compute totals
        int totalValue = 0;
        int totalWeight = 0;
        System.out.println("\nItems selected for transport:");
        for (Item it : res.selected) {
            totalValue += it.value;
            totalWeight += it.weight;
            System.out.printf(" - %s: %d kg, Utility = %d, Priority = %d, Type = %s%n",
                    it.name, it.weight, it.value, it.priority, it.divisible ? "Divisible" : "Indivisible");
        }
        res.totalValue = totalValue;
        res.totalWeight = totalWeight;

        return res;
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Medical Kits", 10, 100, false, 1));
        items.add(new Item("Food Packets", 20, 60, true, 3));
        items.add(new Item("Drinking Water", 30, 90, true, 2));
        items.add(new Item("Blankets", 15, 45, false, 3));
        items.add(new Item("Infant Formula", 5, 50, false, 1));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum weight capacity of the boat (in kg): ");
        int capacity = sc.nextInt();

        Result result = knapsack01(items, capacity);

        System.out.println("\n===== Final Report =====");
        System.out.printf("Total weight carried: %d kg%n", result.totalWeight);
        System.out.printf("Total utility value carried: %d units%n", result.totalValue);
    }
}