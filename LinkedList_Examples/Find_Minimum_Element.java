package LinkedList_Examples;

public class Find_Minimum_Element {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(50);
        ll.add(4);
        ll.add(80);
        ll.add(2);
        ll.add(30);
        ll.add(1);
        System.out.println("minimum elenment in list is" + findMinimum(ll.start));
        
    }
    static int findMinimum(Node start){
        Node t = start;
        int small = t.val;
        while(t != null){
            if(t.val < small){
                small = t.val;
               
            }
             t = t.next;
        }
        return small;
    }
}
