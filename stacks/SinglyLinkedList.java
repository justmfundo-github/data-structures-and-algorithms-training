package stacks;

public class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createSinglyLinkedList(int nodeValue){
    head = new Node();        // Time complexity -------------------> O(1)
    Node node = new Node();   // Time complexity -------------------> O(1)
    node.next = null;         // Time complexity -------------------> O(1)
    node.value = nodeValue;   // Time complexity -------------------> O(1)
    head = node;              // Time complexity -------------------> O(1)
    tail = node;              // Time complexity -------------------> O(1)
    size = 1;

    return head;              // Time complexity -------------------> O(1)
  }

  // insert Method for SinglyLinkedList
  // Space complexity -------------------> O(1) because everytime method is called, only one node is created/needed
  public void insertInLinkedList(int nodeValue, int location){ // Total Time complexity -------------------> O(n)
    // create new node
    Node node = new Node();  
    node.value = nodeValue; // Time complexity -------------------> O(1)
    
    // check if single linked list hasn't yet been created i.e. Does the first node in the list have a value
    if(head == null){
      createSinglyLinkedList(nodeValue); // Time complexity -------------------> O(1)
      return;
    }else if(location == 0){ // if location is 0 then we want to insert new node at the beginning of the list
      node.next = head; // Time complexity -------------------> O(1)
      head = node;
    }else if(location >= size){ // if location is greater than the size of the list then we add to the end of the list
      node.next = null;
      tail.next = node; // Time complexity -------------------> O(1)
      tail = node;
    }else{ // insert at location specified, somewhere in between the list
      Node tempNode = head; // Time complexity -------------------> O(1)
      int index = 0;        // Time complexity -------------------> O(1)

      // traverse the list until we get to the location specified
      while(index < location - 1){ // Time complexity -------------------> O(n)
        tempNode = tempNode.next; // tempNode will reference the current node after which new node will be inserted
        index++;                // Time complexity -------------------> O(1)
      }
      Node nextNode = tempNode.next; // store the current node's reference to it's next node in a temporary Node
      tempNode.next = node; // set current node's next reference to point to the new node
      node.next = nextNode; // set the new node to point to whatever the current node's next node was
      // All the assignments above have Time complexity -------------------> O(1)
    }

    size++;     // Time complexity -------------------> O(1)
  }

  // SinglyLinkedList traversal
  // Space complexity -------------------> O(1) because no new memory is required to traverse existing data structure
  public void traverseSinglyLinkedList(){   // Total Time complexity -------------------> O(n)
    if(head == null){     // Time complexity -------------------> O(1)
      System.out.println("Singly linked list doesn't exist...");
    }else{
      Node tempNode = head; // Time complexity -------------------> O(1)
      for(int i=0; i<size; i++){  // Time complexity -------------------> O(n)
        System.out.print(tempNode.value); // Time complexity -------------------> O(1)
        if(i != size -1){                 // Time complexity -------------------> O(1)
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;         // Time complexity -------------------> O(1)
      }
    }
    System.out.println("\n");           // Time complexity -------------------> O(1)
  }
    
  // Search for a node
  // Space complexity -------------------> O(1) because no additional memory is required to search for a node
  boolean searchNode(int nodeValue){ // Total Time complexity -------------------> O(n)
    if(head != null){       // Time complexity -------------------> O(1)
      Node tempNode = head; // Time complexity -------------------> O(1)
      for(int i=0; i<size; i++){ // Time complexity -------------------> O(n)
        if(tempNode.value == nodeValue){
          System.out.println("Found the node at location: " + i);
          return true;       // Time complexity -------------------> O(1)
        }
        tempNode = tempNode.next; // Time complexity -------------------> O(1)
      }
    }
    System.out.println("Node not found! "); // Time complexity -------------------> O(1)
    return false;
  }

  // deleting a node from singlyLinkedList
  // Space complexity -------------------> O(1) because no additional memory is required to delete from memory
  public void deletionOfNode(int location){ // Final Time complexity -------------------> O(n)
    if(head == null){     // Time complexity -------------------> O(1)
      System.out.println("The singly linked list does not exist!");
      return;
    }else if(location == 0){  // Time complexity -------------------> O(1)
      head = head.next;
      size--;
      if(size == 0){ // if the size of the list is 0 after the decriment then we know the array had only node
        tail = null;
      }

    }else if(location >= size){
      Node tempNode = head;
      for(int i=0; i<size - 1; i++){  // Time complexity -------------------> O(n)
        tempNode = tempNode.next;
      }

      // Time complexity -------------------> O(1)
      if(tempNode == head){ // if tempNode = head then there was only one node in the list
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = null; // Otherwise delete reference to the last node and set tail to the point to the tempNode/2nd last node
      tail = tempNode;
      size--;
    }else{ // node to remove is at given location somewhere in between the list
      Node tempNode = head;
      for(int i=0; i<location-1; i++){ // Time complexity -------------------> O(n)
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }

  // deleting entire singly linked list
  // Space complexity -------------------> O(1) because no additional memory required to delete entire singly linked list
  public void deleteSinglyLinkedList(){ // Time complexity -------------------> O(1)
    head = null;
    tail = null;
    System.out.println("Singly Linked list deleted successfully...");
  }

}
