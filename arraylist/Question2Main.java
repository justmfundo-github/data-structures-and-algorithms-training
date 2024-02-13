package arraylist;

/* Create a function that prints to the console the pairs from a given array
 * [1,3,4,5] pairs will be 11, 13, 14, 15 and 31, 33, 34, 35 and 41, 43, 44, 45 and 51, 53, 54, 55
 * Find the time complexity of said function/method
 */

public class Question2Main {
  public static void main(String[] args) {
    int[] customArray = {1, 3, 4, 5};
    Question2Main question2Main = new Question2Main();
    question2Main.printPairs(customArray);
  }

  public void printPairs(int[] array){
    for(int i=0; i<array.length; i++){ // Time complexity --------------------> O(n)
      for(int j=0; j<array.length; j++){ // Time complexity --------------------> O(n)  so the final complexity is O(n^2)
        System.out.print(array[i] + "" + array[j] + ", "); // Time complexity ------------> O(1)
      }
      System.out.println();
    }
  }

}
