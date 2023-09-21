package Reccursion;

public class Both_Ways {
    public static void main(String[] args) 
    {
        print(5);
    }
    
    static void print(int n)
    {
        if(n==1)
        {
            System.out.println("---");
            System.out.println(n);
            System.out.println("---");
        }
        else
        {
            System.out.println(n);
            
            print(n-1);
            
            System.out.println(n);
        }
    }
}
