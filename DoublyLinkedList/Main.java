package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLStructure list = new DLStructure();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(2);
        list.insertItem(90, 2);
        list.display();
        list.displayReverse();
    }
}
