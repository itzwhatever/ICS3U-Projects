import java.util.*;
import java.io.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args)  {
    //Prompt 3: Averaging Joes
    Scanner input = new Scanner(System.in);
    double average;
    double total= 0;
  


    // Ask user for a list of score
    System.out.print("Enter Score: ");
    String[] tempArr = input.nextLine().split(",");
    
      //make into integer array
    int[] score = new int[tempArr.length];
    for (int i = 0; i < tempArr.length; i++) {
      int tempVal = Integer.parseInt(tempArr[i]);
      score[i] = tempVal;
    } 

    Arrays.sort(score);
    // remove last and first ints in the list and duplicates
      for(int j=1; j<(score.length-1); j++){
        total= total+score[j];
        
      }




    double d;
    d=(score.length-2);
   
    average=total/d;

    System.out.printf("%.2f",average);
    

 
  }
}

