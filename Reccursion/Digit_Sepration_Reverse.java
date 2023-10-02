package Reccursion;

public class Digit_Sepration_Reverse {
    public static void main(String[] args) {
        int n = 1234;
        reverseDigit(n);
    }

    static void reverseDigit(int n) {
        reverseDigitans(n, " ");
    }

    static void reverseDigitans(int n, String ans) {
     
        if(n==0){
            System.out.println(ans);
        }
        else{
            int r = n%10;
            reverseDigitans(n/10, ans+r);
        }
    }
}
