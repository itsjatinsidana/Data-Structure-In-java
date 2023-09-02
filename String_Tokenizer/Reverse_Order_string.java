package String_Tokenizer;



public class Reverse_Order_string {
    public static void main(String[] args) {
        String s = " hello want to travel the world";
        System.out.println(reverseOrder(s));
        
    }
    static String reverseOrder(String s){
        String ans =" ";
     String a[] = s.split(" ");
     for(int i = a.length-1;i>0;i--){
        ans = ans + a[i] + " " ;
        
     }
     ans.trim();
     return ans;
     
    
        
    }
}
