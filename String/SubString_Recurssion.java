package String;

public class SubString_Recurssion {
    public static void main(String[] args) {
        String s = "hello";
        
        subString(s,"");
    }
       static void subString(String s, String ans){
            if(s.equals("")){
                System.out.println(ans);
            }
            else{
                char ch = s.charAt(0);
                s=s.substring(1);
                subString(s, ans+ch);
                subString(s, ans);
            }
       }
}
