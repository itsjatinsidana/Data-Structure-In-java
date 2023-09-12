package Algorithm;

public class LinearSearch {
    
    public static void main(String[] args) 
    {
        int a[] = { 12,13,56,8,9,10,11,5,4,3,1 };
        
        int num = 12;
        
        System.out.println(linearSearch(a, num));   
    }
    
    static int linearSearch(int a[], int num)
    {
        int i, l = a.length;
        boolean found = false;
        
        for(i=0; i<=a.length-1; i++)
        {
            if(num==a[i])
            {
                found = true;
                break;
            }
        }
        
        if(found)
        {
            return i;
        }
        else
        {
            return -1;
        }
    }
}
