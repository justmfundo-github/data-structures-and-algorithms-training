package arrays;

import java.util.Arrays;

public class TwoDimensionalArrayCreation {
  public static void main(String[] args) {
    // Declaration
    int[][] int2DArray;         // ----------------------------> O(1)
    // Instantiation
    int2DArray = new int[2][2]; // --------------> O(1) // Space complexit it O(mn) where m is the number of rows and n the number of columns
    // Initialization
    int2DArray[0][0] = 1; // ----------------------------> O(1)
    int2DArray[0][1] = 2; // ----------------------------> O(1)
    int2DArray[1][0] = 3; // ----------------------------> O(1)
    int2DArray[1][1] = 4; // ----------------------------> O(1)
    // Combine the above initialization operations and you will get --------------> O(n) time complexity

    System.out.println(Arrays.deepToString(int2DArray)); //note the use of deepToString for the purpuses of printing a multi dimensional array

    // Declaration, instantiation and initialization together
    String s2DArray[][] = {{"a", "b"},{"c", "d"}}; // ---------> O(1)

    System.out.println(Arrays.deepToString(s2DArray));// ------> O(1)
  }  
}
