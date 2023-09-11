package Accenture_Question;

import java.util.ArrayList;
import java.util.HashSet;

public class uniqueNumber {
    public static void main(String[] args) {
        int b[] = { 1, 3, 5, 8,6 };
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        getUnique(a, b);
    }

    static void getUnique(int a[], int b[]) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> notCommon = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            hs2.add(b[i]);
        }

        System.out.println("set which include common number " + hs);

        for (int p : a) {
            if (!hs2.contains(p)) {
                notCommon.add(p);
            }
        }
        for (int p : b) {
            if (!hs.contains(p)) {
                notCommon.add(p);
            }
        }
        System.out.println("set which not include common number " + notCommon);
    }
}
