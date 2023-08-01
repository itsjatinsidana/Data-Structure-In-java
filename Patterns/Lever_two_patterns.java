package Patterns;

public class Lever_two_patterns {
    public static void main(String[] args) {
        // count rows , spaces and coloums
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {

                System.out.print("");
            }

            for (int k = 1; k <=2* i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
