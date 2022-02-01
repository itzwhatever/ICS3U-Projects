import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] valA = new int[10];
    int[] valB = new int[10];
    int holder;
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < valA.length; i++) {
      System.out.print("Enter a number between 0 and 25: ");
      holder = input.nextInt();
      valA[i] = holder;
      valB[valA.length - 1 - i] = valA[i];
    }
    System.out.println("Users list");
    for (int i = 0; i < valA.length; i++) {
      System.out.println(valA[i]);

    }
    System.out.println("Reverse list");
    for (int i = 0; i < valA.length; i++) {
      System.out.println(valB[i]);

    }

  }
}
