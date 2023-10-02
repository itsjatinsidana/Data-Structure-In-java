package Reccursion;

public class Digit_Sepration {
    public static void main(String[] args) {
        int n = 1234567;
        digitSepration(n,0);
    }
    static void digitSepration(int n , int count){
        if(n==0){
            System.out.println(count);
        }
       
        else{
            int r = n%10;
         
            digitSepration(n/10, count+1);
        }
    }
}
