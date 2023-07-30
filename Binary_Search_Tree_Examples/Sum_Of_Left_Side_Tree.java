package Binary_Search_Tree_Examples;

public class Sum_Of_Left_Side_Tree {
    public static void main(String[] args) 
    {
        BinarySearchTree bst = new BinarySearchTree();
         
         bst.add(50);
         bst.add(40);
         bst.add(60);
         bst.add(30);
         bst.add(20);
         bst.add(35);
         bst.add(25);
         bst.add(45);
         bst.add(70);
         bst.add(5);
         
         
        
         bst.add(80);
         bst.add(90);
         bst.add(100);
         bst.add(85);   
         
         System.out.println(printLeftOfTree(bst.root));
         
    }
     
    static int printLeftOfTree(TNode t)
    {
        int sum[] = {0};
        
        inOrder(t.LEFT, sum);
        
        return sum[0];
    }
    
     static void inOrder(TNode t, int sum[])
     {
         if(t==null)
         {
             // do nothing
         }
         else
         {
             inOrder(t.LEFT, sum);
             
             System.out.print(t.val+" ");
             sum[0] = sum[0] + t.val;
             
             inOrder(t.RIGHT, sum);
         }
     }    
}