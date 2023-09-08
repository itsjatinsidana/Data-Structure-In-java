package Array_Examples;

public class Monotonic_Array {
    public static void main(String[] args) {
        int a[] = { 2,3,5,7,10,12,15,18,20 };
        
        //int a[] = { 10,9,8,7,3,1 };
        
        //int a[] = { 8,10 };
        
        System.out.println(isMonotonic(a));
    }
    
    static boolean isMonotonic(int a[])
    {
        if(isAscending(a) || isDescending(a))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static boolean isAscending(int a[])
    {
        boolean ans = true;
        
        for(int i=0; i<=a.length-2 ; i++)
        {
            if(a[i]<=a[i+1])
            {
                ans = ans & true;
            }
            else
            {
                ans = ans & false;
                break;
            }
        }
        
        return ans;
    }
    
    static boolean isDescending(int a[])
    {
        boolean ans = true;
        
        for(int i=0; i<=a.length-2 ; i++)
        {
            if(a[i] >= a[i+1])
            {
                ans = ans & true;
            }
            else
            {
                ans = ans & false;
                break;
            }
        }
        
        return ans;
    }
    }
    

