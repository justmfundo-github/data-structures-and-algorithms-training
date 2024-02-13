package arraylist;

/* Create a function that calculates the sum and products of elements in an array
 * Find the time complexity of said function/method
 */

public class Question1Main {
  public static void main(String[] args) {
    int[] customArray = {1,3,4,5};
    Question1Main question1Main = new Question1Main();
    question1Main.sumAndProductOfArray(customArray);
  }

  void sumAndProductOfArray(int[] array){
    int sum = 0;                   // --------------------------> O(1)
    int product = 1;               // --------------------------> O(1)

    for(int i=0; i<array.length; i++){ // --------------------------> O(n)
      sum += array[i];             // --------------------------> O(1)
      product *= array[i];         // --------------------------> O(1)
    }

    System.out.println("Sum is: " + sum + " And Product: " + product); // --------------------------> O(1)
  }
}
