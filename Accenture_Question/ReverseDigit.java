package Accenture_Question;

public class ReverseDigit {
    public static void main(String[] args) {
        int a = 12345;
        System.out.println(reverse(a));
        
    }
    static int reverse(int a){
        String ans = Integer.toString(a);
        StringBuffer sb = new StringBuffer(ans);
     String reversenum=   sb.reverse().toString();
     int b = Integer.valueOf(reversenum);

       return b;
    }
}
