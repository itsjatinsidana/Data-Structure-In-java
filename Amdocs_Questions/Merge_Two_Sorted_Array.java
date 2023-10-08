package Amdocs_Questions;

import java.util.StringTokenizer;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(reverse(s));
    }

    static String reverse(String s) {
        String rev = "";
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        for (int i = 0; i <= n; i++) {
            String ans = st.nextToken();
            StringBuffer sb = new StringBuffer(ans);
            sb.reverse();
           
            rev = sb + rev;
        }
        return rev;

    }
}
