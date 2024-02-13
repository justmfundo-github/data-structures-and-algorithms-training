package stacks;

public class ArrayStack {
  int[] arr;
  int topOfStack;

  public ArrayStack(int size){     // Time complexity ---------------------> O(1)
                        // Space complexity ---------------------> O(n) where n is the size of the stack
    this.arr = new int[size];           
    this.topOfStack = -1;
    System.out.println("The stack is created with size of: " + size);
  }

  // isEmpty
  public boolean isEmpty(){ // Time complexity ---------------------> O(1)
                        // Space complexity ---------------------> O(1) no space consuming operations performed
    if(topOfStack == -1){
      return true;
    }else{
      return false;
    }
  }

  // isFull
  public boolean isFull(){  // Time complexity ---------------------> O(1)
    // Space complexity ---------------------> O(1) no space consuming operations performed
    if(topOfStack == arr.length -1){
      System.out.println("The stack is full");
      return true;
    }else{
      return false;
    }
  }

  // push
  public void push(int value){// Time complexity ---------------------> O(1)
    // Space complexity ---------------------> O(1) no space consuming operations performed
    if(isFull()){
      System.out.println("The stack is full");
    }else{
      arr[topOfStack + 1] = value;
      topOfStack++;
      System.out.println("The value has been successfully added");
    }
  }

  // pop
  public int pop(){ // Time complexity ---------------------> O(1)
    // Space complexity ---------------------> O(1) no space consuming operations performed
    if(isEmpty()){
      System.out.println("The stack is empty");
      return -1;
    }else{
      int topStack = arr[topOfStack];
      topOfStack--;
      return topStack;
    }
  }

  // peek
  public int peek(){ // Time complexity ---------------------> O(1)
    // Space complexity ---------------------> O(1) no space consuming operations performed
    if(isEmpty()){ // consider checking to see if arr is null:  || arr == null
      System.out.println("The stack is empty");
      return -1;
    }else{
      return arr[topOfStack];
    }
  }

  // delete
  public void deleteStack(){
    arr = null;
    System.out.println("The stack has been successfully deleted");
  }
}
