package LinkedList_Examples;

public class LinkedList {
    Node start;

    void makeList() {

        Node nd1 = new Node(10);
        Node nd2 = new Node(20);
        Node nd3 = new Node(30);
        Node nd4 = new Node(40);
        Node nd5 = new Node(50);

        start = nd1;
        nd1.next = nd2;
        nd2.next = nd3;
        nd3.next = nd4;
        nd4.next = nd5;

    }

    void printList() {
        Node t = start;
        while (t != null) {
            System.out.print(t.val + "-->");
            t = t.next;
        }
        System.out.println("x");

    }

    boolean isEmpty() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }

    void add(int val) {
        if (isEmpty()) {
            Node nd = new Node(val);
            start = nd;
        } else {
            Node t = start;
            while (t.next != null) {
                t = t.next;
            }
            Node nd = new Node(val);
            t.next = nd;
        }
    }

    int size() {

        int count = 0;
        Node t = start;
        while (t != null) {

            t = t.next;
            count++;

        }
        return count;

    }
     int indexOf(int val_to_be_found){
        int i =0;
        Node t = start;
        while(t != null){
            if(t.val == val_to_be_found){
                return i;
            }
            else{
                t= t.next;
                i++;
            }
         
        }
          return -1;
     }

}
