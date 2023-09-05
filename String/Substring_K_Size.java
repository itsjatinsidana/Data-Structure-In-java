package String;

import java.util.ArrayList;

public class Substring_K_Size {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJ";
        int k = 5;

        allSubstring(s, k);
    }

    static void allSubstring(String s, int k) {
        int i, l = s.length();
        for (i = 0; i < l - k; i++) {
            String sub = s.substring(i, i + k);
            ArrayList<String> al = new ArrayList<>();

            al.add(sub);
            System.out.print(al);

        }

    }

}
