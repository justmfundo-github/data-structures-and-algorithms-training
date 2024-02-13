package arrays.exercises;

public class Exercise2Main {
  public static void main(String[] args) {
    int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
    //System.out.println(sumDiagonalElements(myArray2D));// calculate the sum of diagonal elements 
    System.out.println(simpleSumDiagonalElements(myArray2D));// the simpler approach
  }
  
  public static int sumDiagonalElements(int[][] array) { // My too complicated solution.
    int sum = 0;
    int count = 0; // you need a counter to keep track of the moving index that has nothing to do with the for loop. This one
                   // counts the position as you traverse the diagonal
    for(int row=0; row<array.length; row++){
        for(int col=0; col<array[0].length; col++){
            sum += array[row][count];
            System.out.println(sum + " : row:" + row + " count: " + count + " col: " + row);
            break; // break from the inner loop so that you don't repeatedly add to sum
        }
        count++;
    }
    return sum;
  }

  public static int simpleSumDiagonalElements(int[][] array) { // The simple solution
    int sum = 0;
    // Only need to loop through the rows and use the incrementation of 
    // the rows as the diagonal counter too.
    for (int i = 0; i < array.length; i++) { 
        sum += array[i][i];
    }

    return sum;
  }

}
