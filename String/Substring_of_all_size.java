package String;

public class Substring_of_all_size {
    public static void main(String[] args) {
        String s = "hello";
        printSubstring(s);

    }

    static void allSubstring(String s , int k) {
        int i, l = s.length();
        for (i = 0; i <= l-k; i++) {
            System.out.println(s.substring(i,i+k));
        }
    }

    static void printSubstring(String s) {
        int i, l = s.length();
        for (i = 1; i <= l; i++) {
            System.out.println("string of size " + i);
            allSubstring(s,i);
     

        }
    }
}
