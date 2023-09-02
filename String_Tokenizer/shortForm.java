package String_Tokenizer;

import java.util.StringTokenizer;

public class shortForm {
    public static void main(String[] args) {
        String s = "first in first out";
        shortform(s);

    }

    static void shortform(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        for (int i = 0; i <= n; i++) {
            String val = st.nextToken();
            char ch = val.charAt(0);
            ch = Character.toUpperCase(ch);
            System.out.println(ch);
        }

    }
}
