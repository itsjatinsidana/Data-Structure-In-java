package Binary_Search_Tree_Examples;



public class InOrder {
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
     inOrdert(bst.root);
        System.out.println();
        System.out.println("-------post order------");
        postORder(bst.root);
        System.out.println();
    }
      
   
   static void inOrdert(TNode t)
   {
       if(t==null)
       {
           
       }
       else
       {
           inOrdert(t.LEFT);
           
        System.out.println(t.val);
           
           inOrdert(t.RIGHT);
}
}
  static void postORder(TNode t)
   {
       if(t==null)
       {
           
       }
       else
       {
           postORder(t.LEFT);
            postORder(t.RIGHT);
           
        System.out.println(t.val);
           
          
}
}
}
