package Accenture_Question;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseDigit1 {
    public static void main(String[] args) {
        int n = 123;
        reverse(n);
    }

    static void reverse(int n) {
        ArrayList<Integer> al = new ArrayList<>();
      String s = Integer.toString(n);
      StringBuffer sb = new StringBuffer(s);
     String rev= sb.reverse().toString();
      int a = Integer.valueOf(rev);
        System.out.println(a);
        al.add(a);
        System.out.println(al);
     
    

        
    }

}
