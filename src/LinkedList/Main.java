package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        Node first = new Node(99);
        Node second = new Node(100);
        Node third = new Node(103);
        Node fourth = new Node(104);

        llist.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        // create a new node
        Node newNode = new Node(102);
        // Insert it between second and third;
        second.next = newNode;
        newNode.next = third;

        // del first node
        llist.head = llist.head.next;

        // del the newNode from the linked list
        second.next = newNode.next;

        Node ref = llist.head;
        while(ref != null)
        {
            System.out.print(ref.data + "-->"); // print the data
            ref = ref.next;
        }



    }
}
