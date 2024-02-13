package arraylist;

public class Question3Main {
  public static void main(String[] args) {
    int[] customArray = {1, 3, 4, 5};
    Question3Main question3Main = new Question3Main();
    question3Main.printUnorderedPairs(customArray);
  }

  /*
   * Time complexity isn't straightforward here. Iteration occurs n-1 and then n-3 and then n-4 etc...
   * You need to figure out the math that leads to n(n-1)/2 ----> n^2/2 - n/2 
   * -----> Finally n^2(we let go of non dominents for O notation)
   */
  public void printUnorderedPairs(int[] array){
    for(int i=0; i<array.length; i++){  
      for(int j=i+1; j<array.length; j++){
        System.out.println(array[i] + ", " + array[j]);
      }
    }
  }
}
