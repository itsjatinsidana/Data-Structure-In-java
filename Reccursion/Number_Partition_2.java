package Reccursion;

public class Number_Partition_2 {
    public static void main(String[] args) {
        int n = 4;
        
        System.out.println(partition(n, " "));
    }

    static int partition(int n, String ans) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return partition(n - 1, ans + "1") +
                    partition(n - 2, ans + "2") +
                    partition(n - 3, ans + "3");
        }

    }
}
