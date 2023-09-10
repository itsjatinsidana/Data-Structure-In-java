package Accenture_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Find_Comon_Number {
    public static void main(String[] args) {
        int a[]= {2,1,1,2,3,4,5,5,7};
        getCommon(a);
    }
     static void getCommon(int a[]){
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> commonNumbers = new HashSet<>();
       for(int i = 0;i<a.length;i++){
     if(!uniqueNumbers.add(a[i])){
        commonNumbers.add(a[i]);
     }
       
       }
       System.out.println(commonNumbers);
       
      
      
     }
}
