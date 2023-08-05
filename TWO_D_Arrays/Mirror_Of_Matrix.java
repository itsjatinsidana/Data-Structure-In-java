package TWO_D_Arrays;

public class Mirror_Of_Matrix {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("----- original matrix----");
        printMatrix(a);
        System.out.println("-----matrix after mirror-------");
        int b[][] = mirror(a);
        printMatrix(b);

    }

    static int[][] mirror(int a[][]) {
        int i, j, m = a.length, n = a[0].length;
        int b[][] = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {

                b[i][n - 1 - j] = a[i][j];

            }
        }
        return b;
    }

    static void printMatrix(int a[][]) {
        int i, j, m = a.length, n = a[0].length;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
