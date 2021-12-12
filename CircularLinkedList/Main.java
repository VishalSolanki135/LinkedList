package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLStructure list = new CLStructure();
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.delete(3);
        list.display();
    }
}
