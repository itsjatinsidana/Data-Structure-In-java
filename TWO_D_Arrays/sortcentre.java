package TWO_D_Arrays;

import java.util.Arrays;

public class sortcentre {
    public static void main(String[] args) {
         int a[][] = {
                        {5,5,5,5,5,5},
                        {4,4,4,4,4,4},
                        {3,3,3,3,3,3},
                        {2,2,2,2,2,2},
                        {1,1,1,1,1,1}
                    };
        
        System.out.println("-- ORIGINAL --");
        printMatrix(a);
        
        sortCenter(a);
        
        System.out.println("-- After Sorting --");
        printMatrix(a);
    }
    
    static void sortCenter(int a[][])
    {
        int i, j, M=a.length, N=a[0].length, k;
        
        int b[] = new int[(M-2)*(N-2)];
        
        // copy center part of 2D to 1D
        k=0;
        for(i=1; i<=M-2; i++)
        {
            for(j=1; j<=N-2; j++)

            {
                
                b[k] = a[i][j];
                k++;
                
            }
        }
        
        // Sort 1D
        Arrays.sort(b);
        
        // Copy Back from 1D to Center of 2D
        k=0;
        for(i=1; i<=M-2; i++)
        {
            for(j=1; j<=N-2; j++)
            {
                a[i][j] = b[k];
                k++;
            }
        }
    }
    
    static void printMatrix(int a[][])
    {
        int i,j;
        
        for(i=0; i<a.length; i++)
        {
            for(j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+"\t"); 
            }
            
            System.out.println();
        }
    }
}
