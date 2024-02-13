package stacks.exercises;

class Node {
  int value;
  Node next;

  public Node(int value) {
      this.value = value;
      this.next = null;
  }
}

public class ExerciseStack {
  private Node peak;
  private int length;

  public ExerciseStack() {
      this.peak = null;
      this.length = 0;
  }

  public void push(int value) {
      Node addedNode = new Node(value);
      
      if(length == 0){
          peak = addedNode;          
      }else{
          addedNode.next = peak;
          peak = addedNode;
      }
      length++;
  }

  public static void main(String[] args) {
    ExerciseStack exerciseStack = new ExerciseStack();
    exerciseStack.push(3);
    exerciseStack.push(31);
    exerciseStack.push(32);
    System.out.println(exerciseStack.peak.value);
    System.out.println(exerciseStack.peak.next.value);
    System.out.println(exerciseStack.peak.next.next.value);

    System.out.println(exerciseStack.length);
  }
  
}

