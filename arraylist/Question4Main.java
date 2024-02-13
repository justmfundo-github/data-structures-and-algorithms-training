package arraylist;

public class Question4Main {
  public static void main(String[] args) {
    int[] customArrayA = {1, 3, 4, 5};
    int[] customArrayB = {1, 3, 4, 5};
    Question4Main question4Main = new Question4Main();
    question4Main.printUnorderedPairs(customArrayA, customArrayB);
  }

  private void printUnorderedPairs(int[] customArrayA, int[] customArrayB) {//Arrays are different so we don't what size each is
    for(int i=0; i<customArrayA.length; i++){   // Time omplexity ------------------> O(a) 
      for(int j=0; j<customArrayB.length; j++){ // Time omplexity ------------------> O(b) ------------> O(ab)
        if(customArrayA[i] < customArrayB[j]){
          System.out.println(customArrayA[i] + "," + customArrayB[j]);
        }
      }
    }
  }

}
