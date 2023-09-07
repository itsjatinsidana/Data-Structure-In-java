package Array_Examples;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {

        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        // char a[] = {'h','e','l','l','o'};

        reverse(a);

        System.out.println(Arrays.toString(a));
    }

    static void reverse(int b[]) {
        int t;
        int l = b.length;
        for (int i = 0; i < l/2; i++) {
            t = b[i];
            b[i] = b[l - 1 - i];
            b[l - 1 - i] = t;

        }
       

    }

}
