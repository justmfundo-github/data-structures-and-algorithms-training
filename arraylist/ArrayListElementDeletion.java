package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListElementDeletion {
  public static void main(String[] args) {
    ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
    System.out.println(stringList);
    System.out.println("ArrayList size: " + stringList.size());

    // Remove element at index
    // Time complexity of remove is ---------------> O(n) because after element removal, all elements after the removal index
    // have to be shifted to the left
    // Space complexity -------------------> O(1) no more space required than original array size
    stringList.remove(2);
    System.out.println(stringList);
    System.out.println("ArrayList size after removal via index: " + stringList.size());

    // Remove element via object 
    // Time complexity of remove is ---------------> O(2n) which becomes O(n) because we first have to search for the object in 
    // the array by traversing each element until the object is found. After element removal, all elements after the removal index
    // have to be shifted to the left
    stringList.remove("D");
    System.out.println(stringList);
    System.out.println("ArrayList size after removal via object: " + stringList.size());
  }
}
