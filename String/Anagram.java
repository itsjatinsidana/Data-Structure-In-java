package String;


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cma";
        System.out.println(isAnagram(s1, s2));

        
    }
    static boolean isAnagram(String s1, String s2){

       char a[]= s1.toCharArray();
       char b[] = s2.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
     if(Arrays.equals(a, b)){
        return true;
     }
     return false;
}
}
