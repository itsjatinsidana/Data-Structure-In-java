package Playing_With_Numbers;

public class Next_Prime {
    public static void main(String[] args) {
        int n =  17;
        System.out.println(nextPrime(n));
    }
   static int nextPrime(int n){
    int ans;
    int i;
    for(i = n+1 ; ; i++){
         if(isPrime(i)){
            ans = i;
           break;
         }
         
    }
    return ans;

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
