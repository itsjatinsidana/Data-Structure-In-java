package String_Tokenizer;

import java.util.Arrays;

public class Swap_First_With_Last {
    public static void main(String[] args) {
        String s = "virat is better than dhoni";
        System.out.println(swap(s));

    }

    static String swap(String s) {
        String a[] = s.split(" ");
        String temp;
        int l = a.length;
        
        temp = a[0];
        a[0] = a[l-1];
        a[l-1] = temp;
        System.out.println(Arrays.toString(a));
       
        String ans = "";
        for(int i = 0;i<a.length;i++){
            ans = ans  +   a[i] + " "  ;
        }
        ans.trim();
        return ans;
    }
    
    
}
