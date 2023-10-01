package Reccursion;

public class Number_Partition1 {
    public static void main(String[] args) {
        int n = 3;
        int count;
        partition(n, " " );
    }

    static void partition(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
          
           
           
 

        } else {
            for (int i = 1; i <= n; i++) {
                partition(n - i, ans + i);
                
            }
        }
    }
}
