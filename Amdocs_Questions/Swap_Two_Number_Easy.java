package Amdocs_Questions;

import java.util.Arrays;

public class Swap_Two_Number_Easy {
    public static void main(String[] args) {
         int[] array1 = {3};
        int[] array2 = {5};

        System.out.println("Before swapping:");
        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));

        // Swap the arrays
        swapNumber(array1, array2);

        System.out.println("After swapping:");
        System.out.println("array1 = " + Arrays.toString(array1));
        System.out.println("array2 = " + Arrays.toString(array2));
    }
    static void swapNumber(int[] array1, int[] array2){
        for(int i=0;i<array1.length;i++){
            int temp = array1[i];
            array1[i]=array2[i];
            array2[i] = temp;
        }
    }
}
