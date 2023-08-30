package String;

public class Palandrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            return true;
        }
        return false;

    }
}
