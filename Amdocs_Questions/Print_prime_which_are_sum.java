package Amdocs_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_prime_which_are_sum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(isPrime(n));
        int[] c = sumOfPrime(n);
        System.out.println(Arrays.toString(c));

    }

    static int[] sumOfPrime(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                al.add(i);
            }

        }

        int[] c = new int[al.size()];
        int j = 0;
        
        for (int p : al) {
            c[j] = p;
            j++;
        }
        for (int i = 0; i < c.length; i++) {
            for (j = 0; j < c.length; j++) {
                if (c[i] + c[j] == n) {
                    al2.add(c[i]);
                    al2.add(c[j]);
                }
            }
        }
       int[] result = new int[al2.size()];
       for(int i =0;i<result.length;i++){
        result[i] = al2.get(i);
       }
        return result;
         

    }

    static boolean isPrime(int n) {
        if (n == 1 || n == 0 || n == 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }

            }
            return true;
        }
    }

}
