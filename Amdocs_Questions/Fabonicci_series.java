package Amdocs_Questions;

public class Fabonicci_series {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(faboni(n));
    }
  static int faboni(int n){
     if(n==1||n==2){
        return 1;
     }
     else{
         return faboni(n-1) + faboni(n-2);
     }
  }
}
