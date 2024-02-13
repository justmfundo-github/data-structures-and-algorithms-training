package stacks;

public class SinglyLinkedListStackMain {
  public static void main(String[] args) {
    SinglyLinkedListStack newStack = new SinglyLinkedListStack();
    newStack.push(2);
    newStack.push(4);
    newStack.push(7);
    boolean result = newStack.isEmpty();
    System.out.println(result);

    int popResult = newStack.pop();
    System.out.println(popResult);

    int peekResult = newStack.peek();
    System.out.println(peekResult);

    newStack.delete();
    System.out.println(newStack.peek());
  }
}
