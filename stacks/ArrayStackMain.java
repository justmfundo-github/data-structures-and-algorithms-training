package stacks;

public class ArrayStackMain {
  public static void main(String[] args) {
    ArrayStack newStack = new ArrayStack(4);
    boolean result = newStack.isFull();
    System.out.println(result);

    newStack.push(1);
    newStack.push(3);
    newStack.push(4);
    newStack.push(5);
    newStack.push(7);  
    
    int popResult = newStack.pop();
    System.out.println(popResult);

    int peekResult = newStack.peek();
    System.out.println(peekResult);

    newStack.deleteStack();
    System.out.println(newStack.peek());

  }
}
