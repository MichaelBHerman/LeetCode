public class Solution {
    public int MaximumWealth(int[][] accounts) {
        int m = accounts.Length, n = accounts[0].Length, result = 0;
        
        for (int i = 0; i < m; i++) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                total += accounts[i][j];
            }
            result = Math.Max(result, total);
        }
        
        return result;
    }
}