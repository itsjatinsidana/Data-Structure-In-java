
package Other_important_question;

import java.util.HashSet;

public class removeduplicate {
    public static void main(String[] args) {
        int a[] = { 3, 5, 6, 7, 8, 7, 5, 3 ,3};
        removeduplicate(a);

    }

    static void removeduplicate(int a[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        System.out.println(hs);
    }
}
