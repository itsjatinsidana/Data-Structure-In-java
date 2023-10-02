package Reccursion;

public class Number_To_Binary {
    public static void main(String[] args) {
        int n = 19;
        convertToBinary(n, " ");
    }

    static void convertToBinary(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
        } else {
            int r = n % 2;
            convertToBinary(n / 2, r+ans);
        }

    }
}
