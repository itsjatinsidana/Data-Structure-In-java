package Amdocs_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int [] a = {1,6,9};
        int []b = {2,3,5};
        int [] c = merge(a,b);
        System.out.println(Arrays.toString(c));
   }
   static int[] merge(int[]a,int[]b){
    ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
            al.add(a[i]);
        }
        for(int i =0;i<b.length;i++){
            al.add(b[i]);
        }
     Collections.sort(al);

        int j=0;
        int[] c= new int[al.size()];
        for(int p :al){
            c[j] = p;
            j++;

        }
        return c;

    }
}
