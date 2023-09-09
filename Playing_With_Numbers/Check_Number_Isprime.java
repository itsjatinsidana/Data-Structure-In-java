package Playing_With_Numbers;



public class Check_Number_Isprime {
    public static void main(String[] args) {
         int n = 16;
        System.out.println( n + " is " + isPrime(n));

    }

    static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        } else {
            boolean flag = true;
           
            for (int i = 2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                   
                }
            }
            return flag;
           
        }
    }
}
