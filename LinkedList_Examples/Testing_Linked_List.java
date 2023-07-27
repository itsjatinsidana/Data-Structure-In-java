package LinkedList_Examples;

public class Testing_Linked_List {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.printList();
        System.out.println("size of list is " + ll.size());
        System.out.println("index of 30 is " + ll.indexOf(30));
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.addFirst(5);
        ll.printList();
    }
}
