public class TimeComplexityCalc {

  /*
   * O(1)    Constant Accessing a specific element in array
   * O(N)    Linear Loop through array elements
   * O(LogN) Logarithmic Find an element in sorted array
   * O(N^2)   Quadratic Looking ar a every index in the array twice
   * O(2^N)   Exponential Double recursion in Fibonacci
   */

  public static void main(String[] args) {
    int n = 10;               
    findTotalNumber(n);       
  }

  static void findTotalNumber(int n){
    int total = 0;                  //----------------------------  O(1)
    for(int i=0; i<n; i++){         //----------------------------  O(n)
      total += i;                   //----------------------------  O(1)
    }

    if(total > 100){                //----------------------------  O(1)
      System.out.println("The total number is greater than 100.."); //----------------------------  O(1)
    }else{
      System.out.println(total);    //----------------------------  O(1)
    }
  }
}
/*
 * Final calculation: O(1) + O(n) + O(1) + O(1) + O(1) + O(1) = O(n)
 */
