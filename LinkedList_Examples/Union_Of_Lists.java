package LinkedList_Examples;

import java.util.LinkedHashSet;

public class Union_Of_Lists {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);

        LinkedList ll2 = new LinkedList();
        ll2.add(20);
        ll2.add(40);
        ll2.add(60);
        ll2.add(70);
        ll2.add(80);

        Node ans = union(ll1.start, ll2.start);

        // print answer
        Node t = ans;

        while (t != null) {
            System.out.print(t.val + " --> ");
            t = t.next;
        }

        System.out.println("X");
    }

    static Node union(Node start1, Node start2) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        Node t1 = start1;
        while (t1 != null) {
            hs.add(t1.val);
            t1 = t1.next;
        }
        Node t2 = start2;
        while (t2 != null) {
            hs.add(t2.val);
            t2 = t2.next;
        }
        Node start3 = null;
        for (int p : hs) {
            Node nd = new Node(p);
            if (start3 == null) {
                start3 = nd;

            } else {
                Node t = start3;
                while (t.next != null) {
                    t = t.next;
                }
                t.next = nd;
            }
        }
        return start3;
    }

}
