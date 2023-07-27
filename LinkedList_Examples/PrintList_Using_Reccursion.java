package LinkedList_Examples;

public class PrintList_Using_Reccursion {
    public static void main(String[] args) {
    
        
    }
    void print(Node t){
        if(t == null){

        }
        else{
            System.out.println(t.val + " ");
            print(t.next);
        }
    }
}
