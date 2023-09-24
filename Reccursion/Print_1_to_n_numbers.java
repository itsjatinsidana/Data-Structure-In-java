package Reccursion;

public class Print_1_to_n_numbers {
    public static void main(String[] args)
    {
        print(5);   
    }
    
    static void print(int n)
    {
        if(n==1)
        {
            System.out.println(n);
        }
        else
        {
            System.out.println(n);
            print(n-1);
        }
    }
}
