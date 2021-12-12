package DoublyLinkedList;

public class DLStructure{
    private int val;
    private Node head;
    private Node tail;
    private int size;

    public DLStructure() {
        this.size = 0;
    }

    // insert At First
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
        if(tail==null) tail = head;
        size++;
    }

    // insertLast
    public void insertLast(int val) {
        Node node = new Node(val);
        if(head==null) {
            node.prev = null;
            head = node;
            return;
        }

        node.next = null;
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    // display DLL
    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // insert At Particular Index
    public void insertItem(int val, int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;
        size++;
    }


    // display reverse
    public void displayReverse() {
        Node temp = tail;
        while(temp!=null) {
            System.out.print(temp.val + "->");
            temp = temp.prev;
        }
        System.out.println("FIRST");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
