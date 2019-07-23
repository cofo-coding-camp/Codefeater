package wechat.group;

public class SurroundedRegions_130 {

    private int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int n, m;
    public boolean inArea(int x, int y){
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public void solve(char[][] board) {

        if (board == null || board.length == 0) return;
        n = board.length;
        m = board[0].length;

        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++){
                if (i == 0 ||  j == 0 || i == n - 1 || j == m - 1)
                    if (board[i][j] == 'O') assist(board, i, j, n, m);
            }
        }

        for (int i = 0; i < n; i ++){
            for (int j = 0; j < m; j ++){
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == '-') board[i][j] = 'O';
            }
        }
    }

    public void assist(char[][] board, int x, int y, int n, int m){
        if (x >= n || y >= m) return;
        for (int i = 0; i < 4; i ++){
            if (board[x][y] == 'O')
                board[x][y] = '-';
            else return;
            int d_x = d[i][0];
            int d_y = d[i][1];
            if (inArea(x + d_x, y + d_y))
                assist(board, x + d_x, y + d_y, n, m );
        }
    }
}
