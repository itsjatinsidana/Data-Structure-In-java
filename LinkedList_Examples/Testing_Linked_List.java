package LinkedList_Examples;

public class Testing_Linked_List {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.add(50);
        ll.add(50);
        ll.add(50);
        ll.add(50);
        ll.add(50);
        ll.printList();
        System.out.println("size of list is " + ll.size());
    }
}
