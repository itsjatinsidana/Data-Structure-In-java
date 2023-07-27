package LinkedList_Examples;

/**
 * ReverseList
 */
public class ReverseList {

    public static void main(String[] args) {
        
    
    LinkedList ll = new LinkedList();
        
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.add(50);
    ll.add(60);
    
    Node rev = reverseList(ll.start);
    
    // print reverse list
    Node t = rev;
    
    while(t!=null)
    {
        System.out.print(t.val+" --> ");
        t = t.next;
    }
}

public static Node reverseList(Node start){
    Node start2 = null;
    Node t = start;
    while(t!=null){
        Node nd = new Node(t.val);
        nd.next = start2;
        start2 = nd;
        t = t.next;
    }
    return start2;

}
}