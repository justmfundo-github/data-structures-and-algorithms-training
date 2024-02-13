package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSearch {
  public static void main(String[] args) {
    ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
    System.out.println(stringList);
    System.out.println("ArrayList size: " + stringList.size());

    // Searching the arrayList using the forEach loop
    // Time complexity of an ArrayList search -----------------> O(n) you may need to visit all the elements to find the search index
    // Space complexity ------------> O(1) No additional memory required beyond the size of the ArrayList when performing search 
    for(String letter : stringList){
      if(letter.equals("F")){
        System.out.println("Element is found");
        break;
      }
    }

    // Searching the arrayList using the indexOf method
    // Time complexity of an ArrayList search -----------------> O(n) you may need to visit all the elements to find the search index
    // Space complexity ------------> O(1) No additional memory required beyond the size of the ArrayList when performing search
    int index = stringList.indexOf("C");
    System.out.println("The element is found at index: " + index);
  }
}
