package Accenture_Question;

import java.util.Arrays;

public class String_Anagram {
    public static void main(String[] args) {
        String s1 = "abbc";
        String s2 = "cbba";
        System.out.println(isAnagram(s1,s2));
    }
     static boolean isAnagram(String s1,String s2){
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
         Arrays.sort(b);
         if(Arrays.equals(a, b)){
            return true;
         }
         else{
            return false;
         }

     }
}
