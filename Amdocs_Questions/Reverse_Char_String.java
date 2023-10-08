package Amdocs_Questions;

import java.util.StringTokenizer;

public class Reverse_Char_String {
    public static void main(String[] args) {
          String input = "what is your name";
        System.out.print(reverse(input));
    }

    static String reverse(String input) {
        StringTokenizer st = new StringTokenizer(input);
        String output = "";
        int n = st.countTokens();
        for (int i = 0; i < n; i++) {
            String ans = st.nextToken();

            StringBuffer sb = new StringBuffer(ans);
            sb = sb.reverse();

            output = output + " " + sb;
        }

        return output;
    }
}
