package arrays;

import java.util.Arrays;

public class SingleDimensionArrayCreation {
  public static void main(String[] args) {
    //Declation
    int[] intArray;       // ------------------------> O(1)
    //Instantiation  
    intArray = new int[3];// ------------------------> O(1)
    //Initialization  
    intArray[0] = 1;      //-------------------------> O(1)
    intArray[1] = 2;      //-------------------------> O(1)
    intArray[2] = 3;      //-------------------------> O(1)
                          //-------------------------> Combine the above 3 operations because they are the same to get O(n)
    System.out.println(intArray);
    System.out.println(Arrays.toString(intArray)); //Using Arrays package to access the array

    String sArray[] = {"a", "b", "c"};    //-------------------------> O(1) Note that all indexes are assigned in one operation!!
    System.out.println(Arrays.toString(sArray));
  }
}
