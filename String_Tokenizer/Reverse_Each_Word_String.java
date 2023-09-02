package String_Tokenizer;

import java.util.*;

public class Reverse_Each_Word_String {
    public static void main(String[] args) {
        String s = "hello world how are you";
        reverseStringWord(s);
        
    }
    static void reverseStringWord(String s){
        String ans = " ";
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        for(int i = 1;i<=count;i++){
            String p = st.nextToken();
            StringBuffer sb = new StringBuffer(p);
            sb.reverse();
             ans = ans + sb.toString() +" ";
            
        }
        System.out.print(ans);

    }
}
