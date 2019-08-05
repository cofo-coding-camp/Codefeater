package wechat.group;

public class FriendCircle_547 {
    public int m, n, ans = 0;
    public int[][] d = {{-1,0}, {0,-1}, {1,0}, {0,1}};
    public boolean[][] visited;
    public int findCircleNum(int[][] M) {
        int m = M.length;
        int n = M[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++){
                if (M[i][j] != 0 && !visited[i][j]) {
                    dfs(M, visited, i , j);
                    ans ++;
                }
            }
        }
        return ans;
    }

    public void dfs(int[][]M, boolean[][] visited, int i, int j ){
        visited[i][j] = true;
        for (int m = 0; m < 4; m ++){
            int[] dxy = d[m];
            int dx = i + dxy[0];
            int dy = j + dxy[1];
            if ( inArea(dx, dy) && !visited[dx][dy] && M[dx][dy] == 1) dfs(M, visited, dx, dy);
        }
        return;
    }

    public boolean inArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
