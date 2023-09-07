package Array_Examples;

import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 ,3,2};

        System.out.println(containsDuplicate(a));
    }

    public static boolean containsDuplicate(int[] nums) {
        int i;

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        for (i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            hs.add(nums[i]);

        }
      

        System.out.println(hs);
        if(hs.size() == nums.length){
            return true;
        }
        return false;

    }

}
