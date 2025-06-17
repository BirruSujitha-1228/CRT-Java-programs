import java.util.HashMap;
import java.util.Map;

public class KnapsackDPBT {

    // Helper function with memoization
    public static int knapsack(int[] weights, int[] values, int W, int n, Map<String, Integer> memo) {
        // Base case
        if (n == 0 || W == 0) {
            return 0;
        }

        // Create a unique key for memoization
        String key = n + "-" + W;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int result;
        if (weights[n - 1] > W) {
            // Skip the item
            result = knapsack(weights, values, W, n - 1, memo);
        } else {
            // Explore both options: include or exclude the item
            int include = values[n - 1] + knapsack(weights, values, W - weights[n - 1], n - 1, memo);
            int exclude = knapsack(weights, values, W, n - 1, memo);
            result = Math.max(include, exclude);
        }

        // Memoize and return
        memo.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = 7;
        int n = weights.length;

        Map<String, Integer> memo = new HashMap<>();
        int maxValue = knapsack(weights, values, capacity, n, memo);

        System.out.println("Maximum value in knapsack: " + maxValue);  // Output: 9
    }
}
