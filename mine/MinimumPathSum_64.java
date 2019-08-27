package wechat.mine;

public class MinimumPathSum_64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] steps = new int[m][n];
        steps[0][0] = grid[0][0];
        for (int i = 1; i < n; i ++){
            steps[0][i] = steps[0][i - 1] + grid[0][i];
        }
        for (int j = 1; j < m; j ++){
            steps[j][0] = steps[j - 1][0] + grid[j][0];
        }

        for (int i = 1; i < m; i ++){
            for (int j = 1; j < n; j ++){
                steps[i][j] = Math.min(steps[i-1][j], steps[i][j-1]) +  grid[i][j];
            }
        }
        return steps[m-1][n-1];
    }
}
