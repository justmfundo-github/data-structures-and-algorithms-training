package linkedlist;

public class CircularSinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public Node createCircularSinglyLinkedList(int nodeValue){  // Space complexity -------------------> O(1) Just one node created  
    head = new Node();          // Time complexity -------------------> O(1)
    Node node = new Node();     // Time complexity -------------------> O(1)
    node.value = nodeValue;     // Time complexity -------------------> O(1)
    node.next = node;           // Time complexity -------------------> O(1)
    head = node;                // Time complexity -------------------> O(1)
    tail = node;                // Time complexity -------------------> O(1)
    size = 1;                   // Time complexity -------------------> O(1)

    return head;                // Time complexity -------------------> O(1)
  }

  public void insertInCircularSinglyLinkedList(int nodeValue, int location){// Space complexity --------> O(1) inserting only one node
                                                                        // Total Time complexity -------------------> O(n)
    // Create the new node with it's value
    Node node = new Node();       // Time complexity -------------------> O(1)
    node.value = nodeValue;       // Time complexity -------------------> O(1)

    // If our new node is te first node
    if(head == null){             // Time complexity -------------------> O(1)
      createCircularSinglyLinkedList(nodeValue);// Time complexity -------------------> O(1)
      return;
    }else if(location == 0){      // Time complexity -------------------> O(1)
      node.next = head;
      head = node;
      tail.next = node;
    }else if(location >= size){   // Time complexity -------------------> O(1)
      tail.next = node;
      tail = node;
      tail.next = head;
    }else{
      Node tempNode = head;
      int index = 0;

      while(index < location - 1){  // Time complexity -------------------> O(n)
        tempNode = tempNode.next;
        index++;
      }
      node.next = tempNode.next;
      tempNode.next = node;
    }
    size++;                         // Time complexity -------------------> O(1)
  }

  // Traversal mode
  public void traverseCircularSinglyLinkedList(){// Space complexity -------------> O(1) No additional memory to perform traversal
                                            // Total Time complexity -------------------> O(n)
    if(head != null){
      Node tempNode = head;         // Time complexity -------------------> O(1)
      // Note that with the use of a while loop and no use of the for loop and size, there would be an infinite loop 
      for(int i=0; i<size; i++){    // Time complexity -------------------> O(n)
        System.out.print(tempNode.value);
        if(i != size -1){           // Time complexity -------------------> O(1)
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;   // Time complexity -------------------> O(1)
      }
    }else{
      System.out.println("\nThe circular linked list does not exist");
    }
    System.out.println();
  }

  public boolean searchCircularSinglyLinkedList(int searchValue){ // Total Time complexity -------------------> O(n)
                            // Space complexity -------------------> O(1) No added memory required to traverse/search the list
    if(head != null){
      Node tempNode = head;
      for(int i=0; i<size; i++){    // Time complexity -------------------> O(n)
        if(tempNode.value == searchValue){           // Time complexity -------------------> O(1)
          System.out.print("Search value found at index: " + i);
          return true;
        } 
        tempNode = tempNode.next;   // Time complexity -------------------> O(1)      
      }
    }
    System.out.print("Search value not found");
    return false;
  }

  public void deleteNodeFromCircularSinglyLinkedList(int location){ // Final/total Time complexity -------------------> O(n) 
                              // Space complexity -------------------> O(1) no extra memory needed to delete one element 
    if(head == null){ // Time complexity -------------------> O(1) 
      System.out.println("CircularSinglyLinkedList does not exist");
      return;
    }else if(location == 0){  // Time complexity -------------------> O(1) 
      // first part if location == 0 handles the situation where there is more than one node in the list
      // if there is only on node then the next two lines simply end up pointing the node back on itself
      // if there is more than one node in the list then head/tail node is pointed to the next node and the oringinal first 
      // node is disregarded and garbage collected
      head = head.next;
      tail.next = head;
      size--; // however when size is reduced by one and it turns out there was only one node because size is now 0
              // then the below code executes anyway setting all references to null and thus removing the one node

      if(size == 0){  // Time complexity -------------------> O(1) 
        tail = null;
        head.next = null;
        head = null;
      }
    }else if(location >= size){
      Node tempNode = head;
      for(int i=0; i<size-1; i++){  // Time complexity -------------------> O(n) 
        tempNode = tempNode.next;
      }
      if(tempNode == head){   // Time complexity -------------------> O(1) 
        head.next = null;
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = head;
      tail = tempNode;
      size--;
    }else{
      Node tempNode = head;
      for(int i=0; i<location-1; i++){    // Time complexity -------------------> O(n) 
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }

  // Delete entire CircularLinkedList from memory
  public void deleteCircularSinglyLinkedList(){   // Final/Total Time complexity -------------------> O(1) 
                                    // Space complexity -------------------> O(1) No extra space required to perform the deletion
    if(head == null){ 
      System.out.println("CircularSinglyLinkedList does not exist");
      return;
    }else{
      head = null;
      tail.next = null;
      tail = null;
      System.out.println("The CircularLinkedList has been deleted...");
    }
  }
}
