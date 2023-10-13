package Reccursion;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Unique_Subsets_In_Lexographical_Order {
     public static void main(String[] args)
    {
        System.out.println(subsets("CBA"));
    }
    
    static List<String> subsets(String s)
    {
           TreeSet<String> ts = new TreeSet<>();
          
           // start reursion logic which will add to set
           subsets(s, "", ts);
        
           ArrayList<String> al = new ArrayList<>();
           
           al.addAll(ts);
           
           return al;
    }
    
    // here al is passed by reference (so only 1 copy of al exists)
    static void subsets(String s, String ans, TreeSet<String> al)
    {   
        if(s.equals(""))
        {
            // ans is ready, print
            //System.out.println(ans);
            
            // also add ans to Set which will auto delete duplicates
            al.add(ans);
        }
        else
        {
            // pick first char (0) of string
            char ch = s.charAt(0);
            
            // substring of all chars starting from 1
            s = s.substring(1);
            
            // include
            subsets(s, ans+ch, al);
            
            // dont include
            subsets(s, ans, al);
        }
    }    
}
