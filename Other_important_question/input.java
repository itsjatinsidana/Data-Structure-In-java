package Other_important_question;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        sum(num, num2);

    }
    static void sum(int num,int num2){
        int total = num + num2;
        System.out.println(total);
    }
}
