package Array_Examples;


import java.util.Arrays;
import java.util.LinkedHashSet;

public class Union_Arrays {
    public static void main(String[] args) {
        int a[] = { 10,15,20,25,30 };
        int b[] = { 12,15,25,40 };
        int c[] = unionArrays(a, b);
        System.out.println(Arrays.toString(c));
    }

    static int[] unionArrays(int a[], int b[]) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        int i;
        for (i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        
        for (i = 0; i < b.length; i++) {
            hs.add(b[i]);
        }
       

        int c[] = new int[hs.size()];
       
        int j =0;
        for(int p: hs)
        {
            c[j] = p;
            j++;
        }
        return c;

    }

}
