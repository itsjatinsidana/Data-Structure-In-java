package Other_important_question;

public class Linear_Search_Names {
    public static void main(String[] args) 
    {
        String a[] = { "sahil","samar", "suneeth", "chirag", "anshpreet", "bhavesh", "abit", "ishleen", "pallavi", "muskan" };
        
        String num = "samar";
        
        System.out.println(linearSearch(a, num));   
    }
    
    static int linearSearch(String a[], String num)
    {
        int i, l = a.length;
        boolean found = false;
        
        for(i=0; i<=a.length-1; i++)
        {
            if(num.equals(a[i]))
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
