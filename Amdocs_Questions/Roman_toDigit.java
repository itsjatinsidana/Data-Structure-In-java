package Amdocs_Questions;

import java.util.*;

public class Roman_toDigit {
    public static void main(String[] args) {
        int n = 1;
        convert(n);
    }

    static void convert(int n) {
        HashMap<Integer, Character> hm = new HashMap<>();
        hm.put(1, 'I');
        hm.put(5, 'V');
        hm.put(10, 'X');
        hm.put(50, 'L');
        hm.put(100, 'C');
        hm.put(500, 'D');
        hm.put(1000, 'M');

    if(hm.containsKey(n)){
    char romanChar = hm.get(n);
    System.out.println("Roman numeral for " + n + " is " + romanChar);
} else {
    System.out.println("No Roman numeral found for " + n);
}
    }
   
    

}
