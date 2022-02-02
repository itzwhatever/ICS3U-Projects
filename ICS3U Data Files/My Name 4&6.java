//import

import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    //4
    //open file
    PrintWriter MyFile = new PrintWriter ("MyName.txt");
    //write data to file
    MyFile.println("Katrina");
    //close file
    MyFile.close();

    //#6
    //display name in console
    //open file
    File displayFile=new File("MyName.txt");

    Scanner inputFile=new Scanner(displayFile);
    //read a line from file
    String name = inputFile.nextLine();
    //displays in console
    System.out.println(name);
    //close file
    inputFile.close();


    

    }
  }
