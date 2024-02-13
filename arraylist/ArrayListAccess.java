package arraylist;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListAccess {
  public static void main(String[] args) {
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("A"); // -----------> adding with no index specified Time and Space Complexity----------> O(1)
    stringList.add("B");
    stringList.add("D");
    System.out.println(stringList);
    System.out.println("ArrayList size: " + stringList.size());

    stringList.add(2, "C");
    System.out.println(stringList);
    System.out.println("ArrayList size: " + stringList.size());

    // accessing specific index values
    System.out.println("************Accessing index values via the get method***************");
    System.out.println(stringList.get(2));// Space and time complexity of the get method ------------> O(1)
    System.out.println(stringList.get(3));

    // ArrayList traversal
    // using for loop
    // Time complexity -----------------> O(n) because we visit each element
    System.out.println("************Iterating through all elements using the for loop***************");    
    for (int i=0; i<stringList.size(); i++){ 
      String letter = stringList.get(i);     
      System.out.print(letter + " ");
    }

    // using forEach loop
    // Time complexity -----------------> O(n) because we visit each element
    // Space complexity ---------------> O(1) because no additional memory is needed
    System.out.println();
    System.out.println("************Iterating through all elements using the forEach loop***************");    
    for(String letter : stringList){ 
      System.out.print(letter + " ");
    }

    // using an Iterator
    // Time complexity -----------------> O(n) because we visit each element
    // Space complexity ---------------> O(1) because no additional memory is needed
    System.out.println();
    System.out.println("************Iterating through all elements using an Iterator***************");    
    Iterator<String> iterator = stringList.iterator();
    while(iterator.hasNext()){
      String letter = iterator.next();
      System.out.print(letter + " ");
    }
  }
}
