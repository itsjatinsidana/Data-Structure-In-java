package Array_Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Duplicates {
    public static void main(String[] args) {
        int a[] = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(findDuplicates(a));
    }

    public static ArrayList<Integer> findDuplicates(int[] a) {

        int i;

        HashMap<Integer, Integer> hs = new HashMap<>();
        Integer old;
        for (i = 0; i < a.length; i++) {
            old = hs.get(a[i]);
             if(old == null){
            hs.put(a[i],1);
        }
        else{
            hs.put(a[i], old+1);
        }
        
        }
       
        ArrayList<Integer> al = new ArrayList<>();
        
        Set<Integer> keys = hs.keySet();
        
        for(int p: keys)
        {
            //System.out.println(p+" --> "+hm.get(p));
            
            if(hs.get(p)!=1)
            {
                al.add(p);
            }
        }
        
        return al;
        

    }
}
