package Patterns;

public class Alpabet_patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + i));
            }
            System.out.println();
        }
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + k));
                k++;
            }
            System.out.println();
        }
    }
}
