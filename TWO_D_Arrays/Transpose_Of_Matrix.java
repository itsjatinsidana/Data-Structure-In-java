package TWO_D_Arrays;

public class Transpose_Of_Matrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("----- original matrix----");
        printMatrix(a);
System.out.println("-----matrix after transpose-------");
        int b[][] = transpose(a);
        printMatrix(b);

    }

    static int[][] transpose(int a[][]) {
        int i, j, m = a.length, n = a[0].length;
        int b[][] = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {

                b[j][i] = a[i][j];

            }

        }
        return b;
    }

    static void printMatrix(int arr[][]) {
        int i, j;

        for (i = 0; i <= arr.length - 1; i++) {
            for (j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
