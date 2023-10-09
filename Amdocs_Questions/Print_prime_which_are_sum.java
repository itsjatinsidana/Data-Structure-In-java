package Amdocs_Questions;

import java.util.ArrayList;

public class Print_prime_which_are_sum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(isPrime(n));

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                al.add(i);
              }

        }
        System.out.println(al);

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
