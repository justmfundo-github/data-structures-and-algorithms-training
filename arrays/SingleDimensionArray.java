package arrays;

public class SingleDimensionArray {

  int arr[] = null;

  public SingleDimensionArray(int sizeOfArray){
    arr = new int[sizeOfArray];                 // Space complexity // -------------------------> O(n) Creating an array of n spaces
    for(int i=0; i<arr.length; i++){
      arr[i] = Integer.MIN_VALUE;
    }
  }
  public void insert(int location, int valueToBeInserted){
    /* Note that we have not implemented two cases wheere the time complexity would be different
     * 1. If we insert into the 1st element of an existing array, all other array values have to be shifted up an index(time consuming)
     * 2. If we have to increase the size of the array because we're adding to the end of the array, that process will be different too.
     */
    try {
      if(arr[location] == Integer.MIN_VALUE){                   // -------------------------> O(1)
        arr[location] = valueToBeInserted;                      // -------------------------> O(1)
        System.out.println("Successfully inserted");          // -------------------------> O(1)
      }else{
        System.out.println("This value is already occupied"); // -------------------------> O(1)
      }
      
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Invalid index to access array");    // -------------------------> O(1)
    }
    
  }
  public void traverseArray(){ // Space complexity // -------------------------> O(1)
    try {
      for(int i=0; i<arr.length; i++){          // -------------------------> O(n)
        System.out.print(arr[i] + " ");         // -------------------------> O(1)
      }  
    } catch (Exception e) {
      System.out.println("Array no longer exists");// --------------------> O(1)
    }
  }

  // Search for an element in the given array (Linear search used here)
  public void searchInArray (int valueToSearch){ // Space complexity // -------------------------> O(1)
    for(int i=0; i<arr.length; i++){            // -------------------------> O(n)
      if(arr[i] == valueToSearch){              // -------------------------> O(1)
        System.out.println("Value is found at index of " + i);// -----------> O(1)
        return;                                 // -------------------------> O(1)
      }
    }
    System.out.println(valueToSearch + " is not found");
  }

  // deleting a value from the given array
  public void deleteValue(int valueToDeleteIndex){ // Space complexity // -------------------------> O(1)
    try {
      arr[valueToDeleteIndex] = Integer.MIN_VALUE;      // -------------------------> O(1)
      System.out.println("The value has been deleted successfully");// -----------> O(1)
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("The value that is provided is not in the array");// ----> O(1)
    }
  }
}