package stacks.exercises;

public class Stack {
    
  public class Node {
      int value;
      Node next;
      
      Node(int value) {
          this.value = value;
          this.next = null;
      }
  }
  
  public Node top;
  public int height;

  public Stack(int initialValue) {
      this.top = new Node(initialValue);
      this.height = 1;
  }

  // ... Other stack methods (push, pop, etc.) can be implemented later ...
}




