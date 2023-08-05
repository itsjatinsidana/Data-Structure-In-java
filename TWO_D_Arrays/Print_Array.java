package TWO_D_Arrays;

public class Print_Array {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
        print(a);
    }

    static void print(int a[][]){
        int i, j;
        int m = a.length;
        int n = a.length;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                   System.out.print(a[i][j] + " " );

            }
            System.out.println("");
         
        }
        
       }
}
