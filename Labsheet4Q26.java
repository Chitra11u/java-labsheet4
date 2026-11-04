class Matrix {
    int[][] m1 = new int[2][2];
    int[][] m2 = new int[2][2];
    static String matrixType = "2x2 Integer Matrix";

    void addAndSubtract(int[][] mat1, int[][] mat2) {
        int[][] localMat1 = mat1;
        int[][] localMat2 = mat2;
        int[][] sum = new int[2][2];
        int[][] diff = new int[2][2];
        
        System.out.println("Matrix Type: " + matrixType);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = localMat1[i][j] + localMat2[i][j];
                diff[i][j] = localMat1[i][j] - localMat2[i][j];
            }
        }
        
        System.out.println("Sum Result:");
        System.out.println(sum[0][0] + " " + sum[0][1] + "\n" + sum[1][0] + " " + sum[1][1]);
        System.out.println("Difference Result:");
        System.out.println(diff[0][0] + " " + diff[0][1] + "\n" + diff[1][0] + " " + diff[1][1]);
    }
}

public class Labsheet4Q26 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        matrix.addAndSubtract(a, b);
    }
}
