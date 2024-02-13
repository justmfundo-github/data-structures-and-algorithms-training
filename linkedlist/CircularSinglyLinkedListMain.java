package linkedlist;

public class CircularSinglyLinkedListMain {
  public static void main(String[] args) {
    CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
    csll.createCircularSinglyLinkedList(5);
    csll.insertInCircularSinglyLinkedList(4, 0);
    csll.insertInCircularSinglyLinkedList(6, 1);
    csll.insertInCircularSinglyLinkedList(7, 5);
    csll.insertInCircularSinglyLinkedList(9, 7);
    csll.insertInCircularSinglyLinkedList(11, 8);
    csll.insertInCircularSinglyLinkedList(13, 8);
    // System.out.println(csll.head.value);
    // System.out.println(csll.head.next.value);
    // System.out.println(csll.head.next.next.value);

    csll.traverseCircularSinglyLinkedList();

    //csll.searchCircularSinglyLinkedList(18);
    csll.deleteNodeFromCircularSinglyLinkedList(7);
    csll.traverseCircularSinglyLinkedList();
    csll.deleteCircularSinglyLinkedList();
    csll.traverseCircularSinglyLinkedList();
  }
}
