package Accenture_Question;

import java.util.Arrays;

public class Subset_Array {
    public static void main(String[] args) {
           
        int a[] = {1, 2, 3, 4, 5, 6};
        int i;
        for (i = 1; i <=a.length; i++) {
            arraySubsets(a, i);
        }
    }

    static void arraySubsets(int a[], int k) {
        int b[] = new int[k];
        int i = 0;
        for (i = 0; i < a.length - (k - 1); i++) {
            b = Arrays.copyOfRange(a, i, i + k);
            System.out.println(Arrays.toString(b));
        }
    }
    }


