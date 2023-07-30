package Binary_Search_Tree_Examples;

public class Hieght_Of_Tree {
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

        System.out.println(height(bst.root));
    }

    static int height(TNode t) {
        if (t == null) {
            return 0;
        } else {
            int left = 1 + height(t.LEFT);
            int right = 1 + height(t.RIGHT);
            int ans = Math.max(left, right);
           return  ans;

        }

    }
}
