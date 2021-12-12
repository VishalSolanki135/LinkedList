package SinglyLinkedList;

public class LinkedListStructure {
    private Node head;
    private Node tail;
    int size = 0;

    public LinkedListStructure() {
        this.size = 0;
    }

    // insert At First
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null) tail = head;
        size+=1;
    }

    // insert At Last and TC is constant because tail is maintaining
    public void insertLast(int val) {
        if(tail == null) insertFirst(val);
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        node.next = null;
        size+=1;
    }

    // insert At particular index
    public void insertItem(int val, int index) {
        if(index==0) {
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size+=1;
    }

    // delete At First
    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if(head==null) tail=null;
        size--;
        return val;
    }

    // delete At Last
    public int deleteAtLast() {
        if(size<=1) deleteFirst();

        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    // delete At particular index
    public int deleteItem(int index) {
        if(index==0) {
            return deleteFirst();
        }

        if(index==size){
            return deleteAtLast();
        }

        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private class Node {
       int val;
       Node next;

       public Node(int val) {
           this.val = val;
       }

       public Node(int val, Node next) {
           this.val = val;
           this.next = next;
       }
    }

    // display
    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.val + "->");
            temp= temp.next;
        }
        System.out.println("END");
    }
}
