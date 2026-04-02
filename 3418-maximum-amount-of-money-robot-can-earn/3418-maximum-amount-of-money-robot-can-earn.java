import java.util.*;

class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;

        int[][][] dp = new int[m][n][3];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
            }
        }

        for (int k = 0; k <= 2; k++) {
            if (coins[0][0] >= 0) {
                dp[0][0][k] = coins[0][0];
            } else {
                if (k > 0)
                    dp[0][0][k] = 0;
                else
                    dp[0][0][k] = coins[0][0];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) continue;

                for (int k = 0; k <= 2; k++) {

                    int best = Integer.MIN_VALUE;

                    if (i > 0) {
                        best = Math.max(best, dp[i - 1][j][k]);
                    }

                    if (j > 0) {
                        best = Math.max(best, dp[i][j - 1][k]);
                    }

                    if (best != Integer.MIN_VALUE) {
                        dp[i][j][k] = Math.max(dp[i][j][k], best + coins[i][j]);
                    }

                    if (coins[i][j] < 0 && k > 0) {
                        int prevBest = Integer.MIN_VALUE;

                        if (i > 0) {
                            prevBest = Math.max(prevBest, dp[i - 1][j][k - 1]);
                        }
                        if (j > 0) {
                            prevBest = Math.max(prevBest, dp[i][j - 1][k - 1]);
                        }

                        if (prevBest != Integer.MIN_VALUE) {
                            dp[i][j][k] = Math.max(dp[i][j][k], prevBest);
                        }
                    }
                }
            }
        }

        return Math.max(dp[m - 1][n - 1][0],
               Math.max(dp[m - 1][n - 1][1], dp[m - 1][n - 1][2]));
    }
}