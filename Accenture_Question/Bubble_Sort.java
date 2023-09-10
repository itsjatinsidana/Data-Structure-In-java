package Accenture_Question;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int a[] = { 4, 2, 7, 1, 9, 3 ,1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("lenth of array " + a.length);

    }

    static void bubbleSort(int a[]) {
        int l = a.length;
        int i, t, j;
        for (i = 0; i <= l; i++) {
            for (j = 0; j <= l-2; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        
    }
}
