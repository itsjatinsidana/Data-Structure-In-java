package String;

import java.util.StringTokenizer;

public class Weight {
    private static int sum;

    public static void main(String[] args) {
        String s = "abc hello world how are you";
        getWieght(s);
    }

    static void getWieght(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        for (int i = 0; i <= count; i++) {
            String token = st.nextToken();
            System.out.println(token + weight(token));

        }

    }

    static int weight(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sum = sum + (96-ch);
        }
        return sum;

    }

}
