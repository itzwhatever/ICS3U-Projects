import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  int [] valA = new int [10];

  Random randomNumber = new Random();
  

  Scanner sc = new Scanner (System.in);

  // Fill array with random numbers.
  for (int j = 0; j < valA.length; j++) 
  {
    int randomRoll = randomNumber.nextInt(100)+1;
    valA[j] = randomRoll;
  }

  int min = valA[0];
  int max = valA[0];

  // Find the minimum and maximum value
  for (int i = 0; i < valA.length; i++) 
  {
    if (valA[i] < min)
    min = valA[i];
      
    if (valA[i] > max)
    max = valA[i];
  }

  System.out.println("Lowest: " + min);
  System.out.println("Highest: " + max);

  }
}
