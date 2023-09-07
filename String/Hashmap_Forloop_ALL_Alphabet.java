package String;

import java.util.HashMap;

public class Hashmap_Forloop_ALL_Alphabet {
    public static void main(String[] args) {
       
        HashMap<Character, Integer> hm = new HashMap<>();
      
       for(char ch ='a';ch<='z';ch++){
        hm.put(ch, ch-'a');
       }
       System.out.println(hm.get(hm));
    }
}
