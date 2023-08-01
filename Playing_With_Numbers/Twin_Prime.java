package Playing_With_Numbers;

public class Twin_Prime {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println(i + " ," + (i + 2));

            }

        }

    }

    static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 1 || n == 0) {
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            return flag;
        }
    }
}
