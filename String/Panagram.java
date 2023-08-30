package String;

import java.util.HashSet;

public class Panagram {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over a lazy dog";
        System.out.println(isPanagram(s));
    }
    static boolean isPanagram(String s){
        HashSet <Character> hs = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z')
            {
            hs.add(ch);
            }
        }
        System.out.println(hs);
        if(hs.size() == 26){
            return true;
        }

        return false;
    }

}
