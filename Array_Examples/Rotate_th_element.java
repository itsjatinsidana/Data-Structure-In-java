package Array_Examples;

import java.util.Arrays;

public class Rotate_th_element {
     public static void main(String[] args) 
    {
        int a[] = { 10,20,30,40,50,60,70,80,90,100 };
        int k=3;
        
        rotate(a, k);
        
        System.out.println(Arrays.toString(a));
    }
    
    static void rotate(int a[], int k)
    {
        int b[] = new int[k];
        
        int i, n = a.length;
        
        // step 1 copy last k elements to small array
        for(i=0; i<=k-1 ; i++)
        {
            b[i] = a[n-k+i];
        }
        
        // step 2 , shift elements by k position
        for(i=n-k-1; i>=0; i--)
        {
            a[i+k] = a[i];
        }
        
        // step 3
        for(i=0;i<=k-1;i++)
        {
            a[i] = b[i];
        }
        
    }
}
