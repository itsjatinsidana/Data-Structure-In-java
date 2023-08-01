package Playing_With_Numbers;

public class Print_All_Prime_Number {
    public static void main(String[] args) {
        int count = 0;
       for (int i = 2; i <=100; i++) {
         
            if (isPrime(i) ) {
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);

    }
  

    static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 1 || n == 0 ) {
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