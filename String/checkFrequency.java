package String;

import java.util.HashMap;

import java.util.Scanner;
import java.util.Set;



public class checkFrequency {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
       // String s = input.nextLine();
       String s = "hello world how are you";
        findFrequency(s);
    }
    static void findFrequency(String s){
        int i;
        HashMap <Character , Integer> hm = new HashMap<>();
        for(i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                Integer val = hm.get(ch);
                if(val == null){
                    hm.put(ch, 1);
                }
                else
                {
                    hm.put(ch, val+1);
                }

            }
           
        }
        System.out.println(hm);

             Set<Character> hs = hm.keySet();
        
        for(char key: hs)
        {
            System.out.println(key+ "\t"+hm.get(key));
        }
    }
 

}
