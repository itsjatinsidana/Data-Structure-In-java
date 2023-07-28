package LinkedList_Examples;

import java.util.ArrayList;

public class Intersection_Of_List {
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

        Node ans = Intersection(ll1.start, ll2.start);

        // print answer
        Node t = ans;

        while (t != null) {
            System.out.print(t.val + " --> ");
            t = t.next;
        }

        System.out.println("X");
        
    }
    static Node Intersection(Node start1, Node start2){
        ArrayList <Integer> al = new ArrayList<>();
        Node t1 = start1;
        while(t1 != null){
            al.add(t1.val);
            t1 = t1.next;
        }
         ArrayList <Integer> al2 = new ArrayList<>();
        Node t2 = start2;
        while(t2 != null){
            al2.add(t2.val);
            t2 = t2.next;
        }
        al.retainAll(al2);
        Node start3 = null;
        for(int p : al){
            Node nd = new Node(p);
                if(start3 == null){
                    start3 = nd;
                }
                else{
                    Node t3 = start3;
                    while(t3.next != null){
                       t3 = t3.next;
                    }
                    t3.next = nd;
                }
        }
        return start3;
    }
   
}
