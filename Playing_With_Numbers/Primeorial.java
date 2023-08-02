package Playing_With_Numbers;
public class Primeorial {
 public static void main(String[] args) {
    int n = 13;
    System.out.println(checkPrimeorial(n) );
    
 }  
 static int checkPrimeorial(int n){
    int fact = 1;
    for(int i = n; i >= 1; i--){
        if(isPrime(i)){
            fact = fact * i;
        }
    }
    return fact;
 }
  static boolean isPrime(int n){
    boolean flag = true;
if(n == 0 || n == 1){
    return false;
}
 else{
    for(int i = 2 ; i <= Math.sqrt(n) ; i++){
        if(n%i == 0){
            flag = false;
        }
    }
     return flag;
 }
  } 
}
