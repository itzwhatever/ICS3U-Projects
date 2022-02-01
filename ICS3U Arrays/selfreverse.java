import java.util.*;

class Main {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

    System.out.print("Enter the length of the array: ");

    int len = input.nextInt();
    int[] userNums = new int[len];

    for (int i = 0; i < userNums.length; i++) {
      System.out.print("Enter a number between 0 to 25: ");
      userNums[userNums.length-1-i] = input.nextInt();
    }
    
    System.out.print(Arrays.toString(userNums));
  }
}

