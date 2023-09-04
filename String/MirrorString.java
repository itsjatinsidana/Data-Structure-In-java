package String;

import java.util.HashMap;

public class MirrorString {
    public static void main(String[] args) {
        String s = "hello";
        mirror(s);
    }
    static void mirror(String s){
       HashMap<Character, Integer> hm = new HashMap<>();
       int i;
       int l =s.length();
       for(char ch ='a';ch<='z';ch++){
        hm.put(ch, ch-'a');
       }
       for (i = 0; i < l; i++) {
        char ch = s.charAt(i);
        if(hm.get(ch) ==null){
         hm.put(ch, 1);
        }
        else{
            Integer ans ;
            ans = hm.get(ch == 25-ch);
            System.out.println(ans);

        }
    }
        

    }
}
