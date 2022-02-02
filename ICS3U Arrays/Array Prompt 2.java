import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //original list
    System.out.print("Enter list of treat names: ");
    String[] treats = input.nextLine().split(",");
    //new item and the index
    System.out.print("Enter new items and where it should be: ");
    String[] newTreats = input.nextLine().split(",");

  
    String[] newList = new String[treats.length + 1];

    //string to int
    int position = (Integer.parseInt(newTreats[1]))-1;

    for (int i = 0; i < newList.length; i++) {
      if (i < position) {
        newList[i] = treats[i];
      }
      else if (i == position) {
        newList[i] = newTreats[0];
      }
      else if (i > position){
        newList[i] = treats[i-1];
      }
    }
    System.out.print((newList[0]));
    for (int i = 1; i < newList.length; i++) {
      System.out.print(", "+(newList[i]));
      } 
    } 
  }
