import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    //new file
    PrintWriter MyFile = new PrintWriter ("NumberList.txt");
    //variables
    int sum = 0;
    int n = 100;

    // for loop
    for (int i = 1; i <= n; ++i) {
      sum += i;     // sum = sum + i everytime it loops
    }
    // print sum to txt file
    MyFile.println("The sum from 1 to 100 is: " + sum);;
    //close in file
    MyFile.close();




    //displays txt file to console
    File displayFile=new File("NumberList.txt");

    Scanner inputFile=new Scanner(displayFile);


    // print sum to console by reading the txt file
    String num = inputFile.nextLine();
    System.out.println(num);

    //close file

    inputFile.close();

    }
  }

 
