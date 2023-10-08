package Amdocs_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[] a = { 1, 4, 7 ,0,0,2};
        int[] b = { 2,0, 3, 9 };
        int[] c = merge(a, b);
        System.out.println(Arrays.toString(c));
    }

    static int[] merge(int[] a, int[] b) {

        ArrayList<Integer> al = new ArrayList<>();
       
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
            al.add(a[i]);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(b[i]!=0){
            al.add(b[i]);
            }
        }
        Collections.sort(al);
        System.out.println(al);
        int j = 0;
        int[] c = new int[al.size()];
        for (int p : al) {
            c[j] = p;
            j++;
        }
        return c;

    }

}
