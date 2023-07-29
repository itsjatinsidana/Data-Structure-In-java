package Binary_Search_Tree_Examples;


public class BinarySearchTree{
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
        
        bst.add(60);
        bst.add(70);
        
        bst.add(80);
        bst.add(90);
        bst.add(100);
        bst.add(85);   
    }

    TNode root;

    boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    void add(int val) {

        if (isEmpty()) {
            TNode nd = new TNode(val);
            root = nd;
            System.out.println( val + " added as first node");
        } else {
            TNode t = root;
            while (true) {
                if (val < t.val) {
                   
                    if (t.LEFT == null) {
                        TNode nd = new TNode(val);
                        t.LEFT = nd;
                        System.out.println(val + " added left of " + t.val);
                        break;
                    }
                    t = t.LEFT;
                } else if (val > t.val) {
                  
                    if (t.RIGHT == null) {
                        TNode nd = new TNode(val);
                        t.RIGHT = nd;
                        System.out.println(val + " added right of " + t.val);
                        break;
                    }
                    t = t.RIGHT;
                }
                else if(val == t.val){
                    System.out.println("duplicate are not allowed");
                    break;
                
                }
            }
        }
    }
}
