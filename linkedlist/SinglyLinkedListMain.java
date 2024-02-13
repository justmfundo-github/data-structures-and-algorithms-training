package linkedlist;

public class SinglyLinkedListMain {
  public static void main(String[] args) {
    SinglyLinkedList sLL = new SinglyLinkedList();
    sLL.createSinglyLinkedList(5);

    //System.out.println(sLL.head.value);
    sLL.insertInLinkedList(6, 1);
    sLL.insertInLinkedList(7, 3);
    //System.out.println(sLL.head.next.next.value);
    sLL.insertInLinkedList(8, 4);
    sLL.insertInLinkedList(9, 0);
    sLL.traverseSinglyLinkedList();

    //sLL.searchNode(12);
    sLL.deleteSinglyLinkedList();
    sLL.traverseSinglyLinkedList();


  }
}
