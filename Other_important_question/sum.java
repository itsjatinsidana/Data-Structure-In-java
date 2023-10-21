package Other_important_question;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(sum(a, b));
       
    }

static int sum(int a, int b){
   int c  = a + b;
   return c;
}

}
