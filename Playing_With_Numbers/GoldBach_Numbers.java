package Playing_With_Numbers;

public class GoldBach_Numbers {
    public static void main(String[] args) 
    {
        int n = 30;
        printGoldBachNumbers(n);
    }
    
    static void printGoldBachNumbers(int num)
    {
        for(int i=1; i<=num/2 ; i++)
        {
            if(isPrime(i) && isPrime(num-i))
            {
                System.out.println(i+","+(num-i));
            }
        }
    }
    
    static boolean isPrime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        else
        {
          int i;
          boolean flag = true;
        
          for(i=2 ; i<=Math.sqrt(n); i++)
          {
            if(n%i==0)          // check division
            {
                flag = false;      
                break;
            }
          }
        
          return flag;
        }
    }   
}
