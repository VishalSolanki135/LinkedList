package SinglyLinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedListStructure list = new LinkedListStructure();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(64);
        list.insertFirst(23);
        list.insertLast(309);
        list.insertItem(4, 3);
//        list.deleteFirst();
//        System.out.println(list.deleteLast());
        System.out.println(list.deleteItem(2));
        list.display();
        System.out.println(list.size);
    }
}
