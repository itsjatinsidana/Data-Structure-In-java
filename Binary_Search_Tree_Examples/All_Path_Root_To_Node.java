package Binary_Search_Tree_Examples;

import javax.print.DocFlavor.STRING;

public class All_Path_Root_To_Node {
    public static void main(String[] args) {
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
        
      
        
        bst.add(80);
        bst.add(90);
        bst.add(100);
        bst.add(85); 
        
        System.out.println();
        allPath(bst.root);
    }

 static   void allPath(TNode t){
        inOrder(t , "");
    }
    static void inOrder(TNode t, String ans){
    if( t == null){

    }
    else if(t.LEFT == null && t.RIGHT == null){
        
        ans = ans + t.val;
        System.out.println(ans);

    }
    else{
        inOrder(t.LEFT ,ans +t.val + " ");
        
        inOrder( t.RIGHT ,ans + t.val + " ");
    }

     }
}
