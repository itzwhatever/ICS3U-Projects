//did it as a group online
import java.util.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  //Prompt 1: First is the worst, Second is the best!
  Scanner input = new Scanner(System.in);

   // Ask user for a list of competitor names
  System.out.print("List the competitors names: ");
  String[] name = input.nextLine().split(",");

   // Ask user for a list of scores
  System.out.print("List the scores: "); 
  String[] tempArr = input.nextLine().split(",");
  
  //make into integer array
  int[] score = new int[tempArr.length];
  for (int i = 0; i < tempArr.length; i++) {
    int tempVal = Integer.parseInt(tempArr[i]);
    score[i] = tempVal;
  } 
  
  //getting the top scorer
  int topScore = 0;
  for (int i : score) {
    if (topScore < i) {
      topScore = i;
    }
  }
  
  //getting second top scorer
  int secTop = 0;
  for (int i : score) {
    if (secTop < i && i != topScore) {
      secTop = i;
    }
  }
  
  //getting index of second top scorer
  int winner = 0;
  for (int i = 0; i < score.length; i++) {
    if (score[i] == secTop) {
      winner = i;
      break;
    }
  }

  //printing to screen
  System.out.println("The winner is: " + name[winner]); System.out.print("With a score of: " + score[winner]);
  }
}

