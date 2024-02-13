package arrays.exercises;

public class Exercise1Main {
  public static void main(String[] args) {
    int[] myArray = {1, 2, 3, 4};
    int[] newArray = middle(myArray);
    for(int i=0; i<newArray.length; i++){
      System.out.print(newArray[i] + " ");
    } 
  }

  public static int[] middle(int[] array) {

    if (array.length <= 2) {
      return new int[0]; // Return an empty array if the input array has 2 or fewer elements
    }
    int[] returnArr = new int[array.length-2];
    
    for(int i=1; i<array.length-1; i++){
        returnArr[i-1] = array[i];
    }
    return returnArr;
}
}
