package String_Tokenizer;

import java.util.StringTokenizer;

public class Longest_Word_in_String {
    public static void main(String[] args) {
        String s = "C C++ JAVA PHYTHON JAVA JAVASCRIPT SWIFT KOTLIN";
        
        System.out.println(longest(s));
        
    }
    static String longest(String s){
        StringTokenizer st = new StringTokenizer(s);
        String longest ="";
        int count = st.countTokens();
        for(int i = 1;i<=count;i++){
            String p = st.nextToken();
            if(p.length()>longest.length()){
                longest = p;
            }
        }
    System.out.println("size is " + longest.length());
        return longest;
    }
}
