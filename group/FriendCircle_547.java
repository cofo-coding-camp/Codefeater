package wechat.group;

public class FriendCircle_547 {
    public int findCircleNum(int[][] M) {

        boolean[] visited = new boolean[M.length];
        int ans = 0;

        for (int i = 0; i < M.length; i ++){
            if (!visited[i]){
                dfs(M, visited, i);
                ans ++;
            }
        }
        return ans;
    }

    public void dfs(int[][] M, boolean[] visited, int i){
        for (int j = 0; j < M.length; j ++){
            if (M[i][j] == 1 && !visited[j]){
                visited[j] = true;
                dfs(M, visited, j);
            }
        }
    }
}
