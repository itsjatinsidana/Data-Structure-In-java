package String;

import java.util.HashMap;

public class MirrorString {
    public static void main(String[] args) {
        String str = "hello";
        str = str.toUpperCase();
        String ans = mirrorString(str);
        System.out.println("Mirror String of "+str+" is :"+ans);
    }
    
    static String mirrorString(String str){
        String s= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        int i;
        
        String ans = "";
        for(i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int n = s.indexOf(ch);
            ans = ans + s.charAt(25-n);
        }
          return ans;
       



    }
}