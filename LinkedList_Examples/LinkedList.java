package LinkedList_Examples;

public class LinkedList {
   Node start;

   void makeList(){

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

   void printList(){
   Node t = start;
   while (t!=null) {
    System.out.print(t.val + "-->");
    t=t.next;
   }
   System.out.println("x");

   }

    
}
