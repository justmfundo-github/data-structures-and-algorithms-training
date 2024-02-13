package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCreation {
  public static void main(String[] args) {
    //ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(30, 10, 20));
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    System.out.println(numbers);
    System.out.println("ArrayList size: " + numbers.size());

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    System.out.println(numbers);
    System.out.println("ArrayList size: " + numbers.size());

    System.out.println();

    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("A"); // -----------> adding with no index specified Time and Space Complexity----------> O(1)
    stringList.add("B");
    stringList.add("D");
    System.out.println(stringList);
    System.out.println("ArrayList size: " + stringList.size());

    // -----------> adding with an index specified Time Complexity----------> O(n)---when n is the size of the list assuming
    // that we add at the first position then all the elements have to be shifted 
    stringList.add(2, "C"); // --------------> Space complexity O(1) ----resizing occurs in one operation
    System.out.println(stringList);
    System.out.println("ArrayList size: " + stringList.size());

    // Note that you can add an element to the end of the ArrayList but you can't add to an index position further than that
    //stringList.add(5, "E");// would cause an error
    stringList.add(4, "E");
    System.out.println(stringList);
    System.out.println("ArrayList size: " + stringList.size());
  }
}
