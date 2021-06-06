//Chani Kinsler Scanner Code for Unit Conversion

//pagage file is located
package UnitConverter.main;

//import scanner
import java.util.Scanner;

//class
public class Converter {
  // main
  public static void main(String[] args) {

    // create variable int called menuSelection = 0
    int menuSelection = 0;
    // create string literal for System.lineSeparator()
    String newL = System.lineSeparator();

    // start a while loop with a conditional statement (menuSelection != number of
    // options)
    // use system.out.println() to print the menu with numbered options

    // use these below to add a a new line for the menu
    // For UNIX/Linux/New Mac-based OS use \n as a new line
    // For old Mac-based OS use \r as a carriage return
    // For use Windows-based OS use \r\n
    // For code to be platform independent use the method System.lineSeparator()
    // this will return the system-dependent line separator string can initilize as
    // a string literal
    while (menuSelection != 5) {
      System.out
          .println("Select an option to Converted:" + newL + "1. Cups to Teaspoons" + newL + "2. Miles to Kilometers"
              + newL + "3. Miles to Feet" + newL + "4.US Gallons to Imperial Gallons " + newL + "5. Quit");

      // use new keyword to to instantiate an object for the scanner
      // Scanner variableName= new Scanner();
      Scanner enterField = new Scanner(System.in);

      // define datatype for cases
      float converted;
      int value;
      String introStatement = ("Enter the number you would like to convert");

      // Case is ifor each option on the menuSelection
      // must break after each case
      // must have default at some point

      switch (menuSelection = enterField.nextInt()) {
        case 1:
          System.out.println(introStatement);
          value = enterField.nextInt();
          converted = value / 48f;
          System.out.println(value + " teaspoons equals " + converted + " cups.");
          break;
        case 2:
          System.out.println(introStatement);
          value = enterField.nextInt();
          converted = value * 1.6f;
          System.out.println(value + "miles equals" + converted + "kilometers");
          break;
        case 3:
          System.out.println(introStatement);
          value = enterField.nextInt();
          converted = value * 5280f;
          System.out.println(value + "miles equals" + converted + "feet.");
          break;
        case 4:
          System.out.println(introStatement);
          value = enterField.nextInt();
          converted = value * .8326f;
          System.out.println(value + " in US Gallons equals" + converted + "in Imperial Gallons.");
          break;
        case 5:
          System.out.println("You have exited the unit converter");
          System.out.println("Thank you for using the Unit Converter");
          break;
        default:
          enterField.close();
          break;
      }
    }
  }
}
