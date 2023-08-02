package Playing_With_Numbers;

public class Super_Prime {
    public static void main(String[] args)
    {
        int n = 41;
        System.out.println(isSuperPrime(n));
    }
    
    static boolean isSuperPrime(int num)
    {
        int n = 2;
        int sum = 0;
        
        boolean flag = false;
        
        while(true)
        {
            sum = sum + n;
            
            if(sum<num)
            {
                n = nextPrime(n);
            }
            else if(sum>num)
            {
                flag=false;
                break;
            }
            else if(sum==num)
            {
                flag=true;
                break;
            }
        }
        
        return flag && isPrime(num);
    }

    static int nextPrime(int n)
    {
        int ans;
        
	for(int i=n+1;    ;i++)
        {
            if(isPrime(i))
            {
                ans = i;
                break;
            }
        }
        
        return ans;
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
