package Array_Examples;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.LinkedHashSet;

public class Intersection_Arrays {
    public static void main(String[] args) {

        int a[] = { 10, 15, 20, 25, 30 };
        int b[] = { 12, 15, 25, 40 };

        int c[] = intersection(a, b);

        System.out.println(Arrays.toString(c));
    }

    static int[] intersection(int a[], int b[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int i;
        for (i = 0; i < a.length ; i++) {
            al.add(a[i]);
        }
       
        ArrayList<Integer> al2 = new ArrayList<>();
        for (i = 0; i < b.length ; i++) {
            al2.add(b[i]);
        }
       

        al.retainAll(al2);
        System.out.println(al);
        
       
       
        int c[] = new int[al.size()];
        int j = 0;
        for (int p : al) {
            c[j] = p;
            j++;
        }
        return c;

    }
}
