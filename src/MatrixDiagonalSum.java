public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if((i==j) || (j == mat.length - i - 1)){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
