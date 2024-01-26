package arrays;

public class OneDimensionalArrMain {
  public static void main(String[] args) {
    SingleDimensionArray sda = new SingleDimensionArray(10);
    sda.insert(0, 0);
    sda.insert(1, 10);
    sda.insert(2, 20);
    sda.insert(1, 30);
    sda.insert(12, 120);

    // int firstElement = sda.arr[0];
    // System.out.println(firstElement);
    // int secondElement = sda.arr[1];
    // System.out.println(secondElement);
    // int thirdElement = sda.arr[2];
    // System.out.println(thirdElement);
    // int fourthElement = sda.arr[3];
    // System.out.println(fourthElement);

    // System.out.println("Array traversal");
    // sda.traverseArray();

    //sda.searchInArray(10);
    System.out.println(sda.arr[0]);
    sda.deleteValue(0);
    System.out.println(sda.arr[0]);
  }
}
