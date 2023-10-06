package Other_important_question;

import java.util.Stack;

public class Check_Valid_Brackets {
    public static void main(String[] args) {
        String s = "[{()}]";

        System.out.println(check(s));
    }

    static boolean check(String s) {
        boolean ans = true;

        Stack<Character> st = new Stack<>();

        int i, l = s.length();

        for (i = 0; i <= l - 1; i++) {
            char ch = s.charAt(i);

            // System.out.println("ch: "+ch);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                // System.out.println(ch+" pushed to stack");
            } else {
                if (st.isEmpty()) {
                    // System.out.println("DO NOT MATCH");
                    ans = false;
                    break;
                } else {
                    char out = st.pop();
                    // System.out.println("out: "+out);

                    if (out == '(' && ch == ')') {
                        // System.out.println("MATCH");
                        ans = ans && true;
                    } else if (out == '{' && ch == '}') {
                        // System.out.println("MATCH");
                        ans = ans && true;
                    } else if (out == '[' && ch == ']') {
                        // System.out.println("MATCH");
                        ans = ans && true;
                    } else {
                        // System.out.println("DO NOT MATCH");
                        ans = false;
                        break;
                    }
                }
            }

        }

        return ans && st.isEmpty();
    }
}
