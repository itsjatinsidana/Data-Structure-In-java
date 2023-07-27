package LinkedList_Examples;

public class Merge_Two_Lists {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        LinkedList ll2 = new LinkedList();
        ll2.add(40);
        ll2.add(50);
        ll2.add(60);
        Node ans = merge(ll.start, ll2.start);
        Node t = ans;
        while (t != null) {
            System.out.println(t.val + " ");
            t = t.next;
        }
        System.out.println();
    }

    static Node merge(Node start1, Node start2) {
        Node t = start1;
        while (t.next != null) {
            t = t.next;
        }
        t.next = start2;
        return start1;
    }
}
