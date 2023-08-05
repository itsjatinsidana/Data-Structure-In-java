package TWO_D_Arrays;

public class Sum_Of_Each_Row {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
    sumOfEachRow(a);
        
    }
    static void sumOfEachRow(int a[][]){
        int i, j, m = a.length, n = a[0].length;
        int sum = 0;
        for (i = 0; i < m; i++) {
             sum =0;
            for (j = 0; j < n; j++) {
              sum = sum + a[i][j];
            }
             System.out.println("sum of " + i + " is " + sum);
        
        }
           
        
    }
}
