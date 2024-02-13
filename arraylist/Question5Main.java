package arraylist;

public class Question5Main {
  public static void main(String[] args) {
    int[] customArrayA = {1, 3, 4, 5};
    int[] customArrayB = {1, 3, 4, 5};
    Question5Main question5Main = new Question5Main();
    question5Main.printUnorderedPairs(customArrayA, customArrayB);
  }

  private void printUnorderedPairs(int[] customArrayA, int[] customArrayB) {//Arrays are different so we don't what size each is
    for(int i=0; i<customArrayA.length; i++){   // Time omplexity ------------------> O(a) 
      for(int j=0; j<customArrayB.length; j++){ // Time omplexity ------------------> O(b) ------------> O(ab)
        for(int k=0; k<1000000; k++){       // Time omplexity ------------------> O(1) ---1000000 is still a constant and is dropped
          System.out.println(customArrayA[i] + "," + customArrayB[j]);// Time omplexity ------------------> O(1)
        }
      }
    }
  }
}
