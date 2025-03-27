// 82.	Create a program to perform matrix multiplication.
class lp82 {
    static void multiply(int[][] A, int[][] B, int rowsA, int colsA, int colsB) {
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        for (int[] row : result) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = { {1, 2}, {3, 4} };
        int[][] B = { {5, 6}, {7, 8} };

        int rowsA = A.length, colsA = A[0].length, colsB = B[0].length;
        System.out.println("Resultant Matrix:");
        multiply(A, B, rowsA, colsA, colsB);
    }
}
