package Reccursion;

public class example1 {
    public static void main(String[] args) {
        int n =3;
        fun(n);
    }
    static void fun(int n){
        if(n==0){
            System.out.println("x");
        }
        else{
            System.out.println(n);
            fun(n-1);
            fun(n-1);
        }
    }
}
