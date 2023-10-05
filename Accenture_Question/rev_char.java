package Accenture_Question;

import java.util.StringTokenizer;

public class rev_char {
    public static void main(String[] args) {
        String input = "Hello world";
        System.out.print(reverse(input));
    }

    static String reverse(String input) {
        StringTokenizer st = new StringTokenizer(input);
        String output="";
        int n = st.countTokens();
        for (int i = 0; i <= n; i++) {
            String ans = st.nextToken();
           
            StringBuffer sb = new StringBuffer(ans);
            sb = sb.reverse();
            System.out.println(sb);
            output = output + sb;
        }
      
        return output;
    }

}
