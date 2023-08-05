package TWO_D_Arrays;

public class Print_Upper_Half {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
    upperHalf(a);
        
    }
    static void upperHalf(int a[][]){
        int i, j, m = a.length, n = a[0].length;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if(i<=j){
                    System.out.print(a[i][j] );
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
