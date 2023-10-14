package Reccursion;

import java.util.Stack;

public class Print_Reverse_Of_Stack {
    
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        
        print(st);
    }
    
    static void print(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
           // return;
        }
        else
        {
            int n = st.pop();
            
            print(st);
            
            System.out.println(n);
        }
    }
}
