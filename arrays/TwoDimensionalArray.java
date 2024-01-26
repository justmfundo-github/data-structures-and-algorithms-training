package arrays;
 
public class TwoDimensionalArray{
  int arr[][] = null;

  // Constructor
  public TwoDimensionalArray(int numberOfRows, int numberOfColumns){// Space complexit it O(row * col). Number of rows times the number of columns
    this.arr = new int[numberOfRows][numberOfColumns]; // ----------------------------> O(1)  
    for(int row=0; row<arr.length; row++){
      for(int col=0; col<arr[0].length; col++){
        arr[row][col] = Integer.MIN_VALUE;
      }
    }
  }

  public void insertValueInTheArray(int row, int col, int value){ /// space complexity // -------------------------------> O(1)
    try {
      if(arr[row][col] == Integer.MIN_VALUE){                 // -------------------------------> O(1)
        arr[row][col] = value;
        System.out.println("The value has been successfully inserted");// --------------------> O(1)
      }else{
        System.out.println("The cell is already occupied"); // -------------------------------> O(1)
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index for a 2D Array");   // -------------------------------> O(1)
    }

  }

  // Accessing cell value from given array
  public void accessCell(int row, int col){ // space complexity // -------------------------------> O(1)
    System.out.println("\nAccessing row: #" + row + ", Col: #" + col);  // -------------------------------> O(1)

    try {
      System.out.println(" Cell value is: " + arr[row][col]);           // -------------------------------> O(1)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index for a 2D array");             // -------------------------------> O(1)
    }
  }

  // traverse 2D array
  public void traverse2DArray(){  // space complexity // -------------------------------> O(1)
    for(int row=0; row < arr.length; row++){      // -------------------------------> O(m)
      for(int col=0; col < arr[0].length; col++){ // -------------------------------> O(n) *********Total: O(mn)
        System.out.print(arr[row][col] + " ");    // -------------------------------> O(1)
      }
      System.out.println();                       // -------------------------------> O(1)
    }
  }

  // perform Linear search of 2D Array
  public void searchingValue(int searchValue){ // space complexity // -------------------------------> O(1)
    for(int row=0; row < arr.length; row++){      // -------------------------------> O(m)
      for(int col=0; col < arr[0].length; col++){ // -------------------------------> O(n) *********Total: O(mn)
        if(arr[row][col] == searchValue){                                      // -------------------------------> O(1)
          System.out.print("Value is found at row: " + row + " col: " + col);  // -------------------------------> O(1)
          return;
        }
      }
    }
    System.out.println("Value not found");                       // -------------------------------> O(1)
  }

  // delete from the 2D Array
  public void deleteValueFromArray(int row, int col){
    try {
      System.out.println("Successfully deleted: " + arr[row][col]); // -------------------------------> O(1)
      arr[row][col] = Integer.MIN_VALUE;                            // -------------------------------> O(1)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("This index is not valid for the array");// -------------------------------> O(1)
    }
    
  }
}