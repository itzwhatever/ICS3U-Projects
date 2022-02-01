import java.util.*;
class Main {
  public static void main(String[] args) {
  int [] height = new int [20];

  int total = 0; // Initialize accumulator
  int random_int;
  int average; // Will hold the average
  int min = 140;  
  int max = 200;  
  for (int i=0; i<height.length; i++){
    random_int = (int)(Math.random() * (max - min + 1) + min);
    height[i] = random_int;
    total += random_int;

   

  }
  average = total / height.length;
  System.out.println("The average of the 20 heights are "+average+" cm");
  System.out.println("The heights that are above the average are: ");
  for (int i=0; i<height.length; i++){
    if (height[i]>=average){
      System.out.println(height[i]+"cm");
    }
    else{
      continue;
    }
  }

  }
}




