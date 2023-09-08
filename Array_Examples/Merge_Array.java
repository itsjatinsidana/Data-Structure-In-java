package Array_Examples;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Array {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40 };
        int b[] = { 50, 60, 70 };

        int c[] = merge(a, b);
        System.out.println(Arrays.toString(c));
    }

    static int[] merge(int a[], int b[]) {
        int i, l = a.length, m = b.length;
       int c[] = new int[l+m];
       for(i=0;i<l;i++){
        c[i] = a[i];
       }
       for(i=0;i<m;i++){
        c[i+l] = b[i];
       }
       return c;


    }
}
