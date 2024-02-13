package arraylist;

import java.util.Arrays;

public class Question6Main {
  public static void main(String[] args) {
    int[] customArray = {1, 3, 4, 5};
    System.out.println(Arrays.toString(customArray));
    Question6Main question6Main = new Question6Main();
    question6Main.reverseArray(customArray);
  }

  private void reverseArray(int[] customArray) {
    for(int i=0; i<(customArray.length/2); i++){  // Time complexity -----------------------> O(n/2)------> O(n)
      int other = customArray.length-i-1;         // Time complexity -----------------------> O(1)
      int temp = customArray[i];                  // Time complexity -----------------------> O(1)
      customArray[i] = customArray[other];        // Time complexity -----------------------> O(1)
      customArray[other] = temp;                  // Time complexity -----------------------> O(1)
    }
    System.out.println(Arrays.toString(customArray));// Time complexity -----------------------> O(n)
  }
}
