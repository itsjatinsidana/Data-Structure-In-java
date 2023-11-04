package Other_important_question;

public class Linearsearch {
    public static void main(String[] args) {
        int a[] = { 10, 18, 16, 20, 22, 24, 33 };
        int num = 16;
        System.out.println(search(a, num));

    }

    static int search(int a[], int num) {
        boolean found = false;
        int i;
        for (i = 0; i < a.length; i++) {
            if (num == a[i]) {
                found = true;
                break;
            }

        }
        if (found) {

            return i;
        } else {
            return -1;
        }
    }
}
