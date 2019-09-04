package wechat.mine;

public class Searcha2DMatrixII_240 {

    public boolean binarySearch(int[][] matrix, int target, int start, boolean vertical){
        int lo = start;
        int hi = vertical ? matrix[0].length - 1 : matrix.length - 1;
        while (hi >= lo){
            int mid = (lo + hi)/2;
            if (vertical) {
                if (matrix[start][mid] < target) lo = mid + 1;
                else if (matrix[start][mid] > target) hi = mid - 1;
                else return true;
            } else {
                if (matrix[mid][start] < target) lo = mid + 1;
                else if (matrix[mid][start] > target) hi = mid - 1;
                else return true;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        //iter over matrix
        int shortDim = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < shortDim; i ++){
            boolean verticalFound = binarySearch(matrix, target, i, true);
            boolean horizontalFound = binarySearch(matrix, target, i, false);

            if (verticalFound || horizontalFound) return true;
        }
        return false;
    }

    public boolean searchMatrix_II(int[][] matrix, int target){
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) row --;
            else if (matrix[row][col] < target) col ++;
            else return true;
        }
        return false;
    }
}
