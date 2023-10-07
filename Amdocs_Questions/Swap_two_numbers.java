package Amdocs_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Swap_two_numbers {
    public static void main(String[] args) {

        System.out.println("First number is ");
        int a[] = { 10 };
        System.out.println("second number is ");
        int b[] = { 20 };
        int c[] = swap(a, b);
        System.out.println(Arrays.toString(c));
    }

    static int[] swap(int a[], int b[]) {
        int i, l = a.length, m = b.length;

        int arr[] = new int[l + m];
        for (i = 0; i < l; i++) {
            arr[i] = a[i];
        }
        for (i = 0; i < m; i++) {
            arr[i + 1] = b[i];
        }
        reverse(arr);
        return arr;

    }

    static void reverse(int[] arr) {
        int n = arr.length;
        int t;
        for (int j = 0; j < n / 2; j++) {
            t = arr[j];
            arr[j] = arr[n - 1 - j];
            arr[n - 1 - j] = t;
        }
    }

}
