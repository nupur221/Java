public class CLP_Knapsack {

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int[] securityLevels = {1, 2, 1, 3};
        int capacity = 5;
        int securityThreshold = 4;

        int[][][] dp = new int[weights.length + 1][capacity + 1][securityThreshold + 1];

        for (int i = 1; i <= weights.length; i++) {
            for (int w = 0; w <= capacity; w++) {
                for (int s = 0; s <= securityThreshold; s++) {
                 
                    if (weights[i - 1] <= w && securityLevels[i - 1] <= s) {
                  
                        dp[i][w][s] = Math.max(dp[i - 1][w][s],dp[i - 1][w - weights[i - 1]][s - securityLevels[i - 1]] + values[i - 1]);
                    } else {
                       
                        dp[i][w][s] = dp[i - 1][w][s];
                    }
                }
            }
        }
        int maxP= dp[weights.length][capacity][securityThreshold];
        System.out.println("Maximum profit: " + maxP);

       
        int rC = capacity;
        int remainingSecurity = securityThreshold;
        System.out.print("Selected items: ");
        for (int i = weights.length; i > 0 && maxP > 0; i--) {
            if (dp[i][rC][remainingSecurity] != dp[i - 1][rC][remainingSecurity]) {
                System.out.print(i - 1 + " ");
                maxP -= values[i - 1];
                rC -= weights[i - 1];
                remainingSecurity -= securityLevels[i - 1];
            }
        }
    }
}
