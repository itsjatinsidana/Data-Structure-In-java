package String_Tokenizer;

import java.util.Arrays;

public class Rearrange_Words_of_String_Alphabetic_Order {
     public static void main(String[] args) 
    {
        String s = "hello java world how are you";
        
        System.out.println(rearrange(s));
    }
    
    static String rearrange(String s)
    {
        String arr[] = s.split(" ");
        
        Arrays.sort(arr);
        
        String ans = "";
        
        for(int i=0; i<=arr.length-1; i++)
        {
            ans = ans +arr[i] + " "; 
        }
        
        ans = ans.trim();
        
        return ans;
    }
}
