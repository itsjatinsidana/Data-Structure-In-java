package Accenture_Question;

import java.util.*;
import java.util.Arrays;

public class Smallest_Element_Varriation_2 {
    public static void main(String[] args) {
        int a[] = {6,1,4,1,3};
    
        smallestElement(a);

    }
    static void smallestElement(int[] a){
       Arrays.sort(a);
         System.out.println(a[0]);
       
       
    }
}
