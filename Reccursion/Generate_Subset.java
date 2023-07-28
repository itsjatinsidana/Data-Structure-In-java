package Reccursion;

public class Generate_Subset {
    public static void main(String[] args) {
        
        
            String s = "ABC";
            subsets(s, "");
        }
        
        static void subsets(String s, String ans)
        {
                    if(s.equals("")){
                        System.out.println(ans);

                    }
                    else{
                        char ch = s.charAt(0);

                            s = s.substring(1);                      
                        
                        subsets(s, ans+ch);
                        subsets(s, ans);
                    }
        }
}
