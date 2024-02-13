package arrays;

import java.util.Scanner;

public class AverageTempExercise {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.print("How many days temperature? ");
    int numDays = console.nextInt();
    int sum = 0;

    // save the data inputs to an array and find the average temp
    int[] temps = new int[numDays];

    for(int i=0; i<numDays; i++){
      System.out.print("Day " + (i+1) + "'s high temp: ");
      temps[i] = console.nextInt();
      sum += temps[i];
    }
     double average = sum / numDays;
     // count the number of days where temp is above the average
     int above = 0;
     for(int i=0; i<temps.length; i++){
      if(temps[i] > average){
        above++;
      }

     }
     System.out.println();
     System.out.println("Average Temp = " + average);
     System.out.println("Number of days abover the average is: " + above);
  }
}
