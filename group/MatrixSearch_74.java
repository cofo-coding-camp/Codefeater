package wechat.group;

public class MatrixSearch_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0){
            if (matrix[row][col] < target) row ++;
            else if (matrix[row][col] > target) col --;
            else return true;
        }
        return false;
    }

    public boolean searchMatrix_II(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;

        int left = 0, right = m *n - 1;
        int pivotIdx, pivotEle;

        while (left <= right) {
            pivotIdx = (left + right)/2;
            pivotEle = matrix[pivotIdx/n][pivotIdx % n];
            if (target == pivotEle) return true;
            else {
                if (target < pivotEle) right = pivotIdx - 1;
                else left = pivotIdx + 1;
            }
        }
        return false;
    }
}
