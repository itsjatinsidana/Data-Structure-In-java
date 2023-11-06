package Other_important_question;

import java.util.Arrays;

public class Sieve_Of_Eratosthenos {
    public static void main(String[] args) {
        int n = 50;
        filterPrimes(n);
    }

    static void filterPrimes(int n) {
        if (n == 0 || n == 1) {
            System.out.println("No Primes ...");
        } else {
            int arr[] = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                arr[i] = i;
            }

            // System.out.println(Arrays.toString(arr));

            for (int i = 2; i <= Math.sqrt(n); i++) {
                // if number is already cross eg 4, dont try multiple
                if (arr[i] != 0) {
                    // System.out.println("Try "+i);

                    for (int j = 2; i * j <= n; j++) {
                        if (arr[i * j] != 0) {
                            // cross i*j
                            // System.out.println("Cross X "+(i*j));
                            arr[i * j] = 0;
                        }
                    }
                }
            }

            System.out.println(Arrays.toString(arr));

            int count = 0;

            for (int i = 2; i <= n; i++) {
                if (arr[i] != 0) {
                    count++;
                }
            }

            System.out.println(count + " primes");
        }
    }
}
