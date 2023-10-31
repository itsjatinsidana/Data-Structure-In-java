
package Other_important_question;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even number ");
        } else {
            System.out.println(num + " is odd number ");
        }
        scan.close();
    }
}
