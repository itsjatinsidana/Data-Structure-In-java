package LinkedList_Examples;

import java.util.ArrayList;
import java.util.Collections;

public class Merge_Sorted_List {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        
        LinkedList ll2 = new LinkedList();
        
        ll2.add(10);
        ll2.add(15);
        ll2.add(25);
        ll2.add(35);
        
        Node start3 = mergeTwoLists(ll1.start, ll2.start);
        
        // print output
        Node t = start3;
        
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
    static Node mergeTwoLists(Node start1, Node start2){
       ArrayList <Integer> al = new ArrayList<>();
       Node t1 = start1;
       while(t1 !=null){
        al.add(t1.val);
        t1 = t1.next;
       }
       Node t2 = start2;
       while(t2 != null){
        al.add(t2.val);
        t2 = t2.next;
       }
      Collections.sort(al);
      
      
       Node start3 = null;
        for(int p : al){
             Node nd = new Node(p);
            if(start3 == null){
         start3 = nd;
       }
       else {
           Node t3 = start3;
           while(t3.next !=null){
            t3 = t3.next;
           }
           t3.next = nd;
       }
        }
        return start3;
        // reverse sorted list
      //  return reverseList(start3); 
       
    }
}
