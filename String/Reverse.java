package String;

public class Reverse {
    public static void main(String[] args) {
        String s = "hello";
         reverse(s);
    }
    static void reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}
