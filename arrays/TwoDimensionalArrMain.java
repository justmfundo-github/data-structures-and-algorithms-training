package arrays;

import java.util.Arrays;

public class TwoDimensionalArrMain{
  public static void main(String[] args) {
    TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
    tda.insertValueInTheArray(0,0,10);
    tda.insertValueInTheArray(0,1,20);
    tda.insertValueInTheArray(0,2,30);

    //tda.accessCell(0, 1);
    //tda.traverse2DArray();
    //tda.searchingValue(50);
    System.out.println(Arrays.deepToString(tda.arr));
    tda.deleteValueFromArray(0, 0);

    System.out.println(Arrays.deepToString(tda.arr));
  }
}