package TWO_D_Arrays;

public class Sum_Diagonals {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfDiagnols(a));
    }

    static int sumOfDiagnols(int a[][]) {
        int i, j, m = a.length, n = a[0].length;
        int sum = 0;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {                    // left diagnol
                    sum = sum + a[i][j];
                }
                else if(i+j == n-1){       // right diagnol
                    sum = sum + a[i][j];
                }

            }
        }
        return sum;
    }
}
