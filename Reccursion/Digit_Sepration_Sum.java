package Reccursion;

public class Digit_Sepration_Sum {
    public static void main(String[] args) {
        int n =12;
        digitSum(n,0);
    }
    static void digitSum(int n , int sum){
        if(n==0){
            System.out.println(sum);
        }
        else{
            int r = n%10;
            sum= sum +r;
            digitSum(n/10, sum);
        }
    }
}
