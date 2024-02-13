package stacks;

public class SinglyLinkedListStack {
  SinglyLinkedList singlyLinkedList;

  public SinglyLinkedListStack(){
    singlyLinkedList = new SinglyLinkedList();
  }

  // push
  public void push(int value){    // Time complexity --------------------------> O(1)
    singlyLinkedList.insertInLinkedList(value, 0);
    System.out.println("Inserted value in stack");
  }

  // isEmpty
  public boolean isEmpty(){   // Time complexity --------------------------> O(1)
                      // Space complexity --------------------------> O(1) no extra memory required
    if(singlyLinkedList.head == null){
      return true;
    }else{
      return false;
    }
  }

  // pop
  public int pop(){   // Time complexity --------------------------> O(1)
    // Space complexity --------------------------> O(1) no extra memory required
    int result = -1;
    if(isEmpty()){
      System.out.println("The stack is empty");
    }else{
      result = singlyLinkedList.head.value;
      singlyLinkedList.deletionOfNode(0); // Deleting from 0 index takes ---------------->O(1)
    }
    return result;
  }

  // peek
  public int peek(){    // Time complexity --------------------------> O(1)
    // Space complexity --------------------------> O(1) no extra memory required
    if(isEmpty()){
      System.out.println("The stack is empty");
      return -1;
    }else{
     return singlyLinkedList.head.value;    
    }
  }

  // delete
  public void delete(){
    singlyLinkedList.head = null;
    System.out.println("The stack is deleted");
  }
}
