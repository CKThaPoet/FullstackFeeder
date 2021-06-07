//Chani Kinsler Scanner Code for Unit Conversion

//package file location called main
package unitconverter.main;

//import scanner
import java.util.Scanner;

//make a public class named Converter
public class Converter {

  /*
   * start a public access modifier making it globally available so the JVM can
   * invoke the main method outside the class, use the static keyword so it can
   * access before any objects of its class are created, and without reference to
   * any object, also use void because the main method isnt returning anything
   * name the method main and inside the method paramenters use Strings[] args it
   * is a string array of arguments
   */
  public static void main(String[] args) {

    // create variable int called menuSelection = 0
    int menuSelection = 0;

    // use these below to add a a new line for the menu
    // For UNIX/Linux/New Mac-based OS use \n as a new line
    // For old Mac-based OS use \r as a carriage return
    // For use Windows-based OS use \r\n
    /*
     * For code to be platform independent use the method System.lineSeparator()
     * this will return the system-dependent line separator string can be initilized
     * as a string literal
     */

    /*
     * Declare a string literal for System.lineSeparator(), place this method into a
     * reference variable to be used over and over use the String as a datatype
     */
    String newL = System.lineSeparator();

    /*
     * start a while loop with a conditional statement (menuSelection != number of
     * options) use system.out.println() to print the menu with numbered options
     * inside the parameter
     */

    while (menuSelection != 5) {
      System.out
          .println("Select an option to Converted:" + newL + "1. Cups to Teaspoons" + newL + "2. Miles to Kilometers"
              + newL + "3. Miles to Feet" + newL + "4.US Gallons to Imperial Gallons " + newL + "5. Quit");

      /*
       * use new keyword to to instantiate an object for the scanner we are using a
       * string object because because the JVM will be forced to a create a new string
       * reference every time the variableName is already in use
       */

      // Example of how to an initialize an object to use the scanner
      // Type Scanner variableName= new Scanner()

      Scanner enterField = new Scanner(System.in);

      // a variable is a name given to a memory location. It is the basic unit of
      // storage in a program.*/
      /*
       * The value stored in a variable can be changed during program execution. A
       * variable is only a name given to a memory location, all the operations done
       * on the variable effects that memory location. In Java, all the variables must
       * be declared before use.
       */

      // Example declare the datatype then the variableName
      // One will be for the conversion formula
      // One will be used for the value we enter into the scanner
      /*
       * Finally a initalize a string object that will be used repeatedly for the user
       * to ask them what they would like to convert
       */
      float converted;
      int value;
      String introStatement = ("Enter the number you would like to convert");

      // Case is for each option on the menuSelection
      // Must break after each case
      // Must have default at some point
      // Use .nextDATATYPE method with the variable name for the scanner
      /*
       * Use nextLine() method with strings so the class advances this scans past the
       * current line and returns the input that was skipped. This function prints the
       * rest of the current line, leaving out the line separator at the end. The next
       * is set to after the line separator
       */
      /*
       * Use nextInt() method with whole numbers so the class scans the next token of
       * the input as a Int. If the translation is successful, the scanner advances
       * past the input that matched
       */

      /*
       * Start a switch statement with the paramenter menuSelection = the
       * scannerName.nextDATATYPE() method
       */
      // For each case
      /*
       * Start with printing the variableName for the initalized string statement we
       * will ask from the user
       */
      // Example System.out.println(introStatement)
      /*
       * Have the variableName for the value we will enter into the scanner = to
       * scannerName.nextInt() or scannerName.nextLine() for string returns
       */
      // Example value = enterField.nextInt()
      /*
       * Have the declared variableName for the conversion formula = the variableName
       * for the value we get from the user using the scanner then the conversion
       * formula itself
       */
      // Example converted = value / 48f
      /*
       * Finally print the concatanation statement to the user since we now have all
       * the values needed to complete
       */
      /*
       * Example System.out.println(value +" teaspoons equals " + converted +
       * " cups.")
       */
      /*
       * Must have a default at the end of the swtich statement cases this is to
       * provide an option in case the condtions specified to trigger the execution of
       * code within the other options does not occur so that the program will not
       * crash
       */
      /*
       * Use the scannerName.close() method to close the scanner to prevent memory
       * resourse leaks
       */

      switch (menuSelection = enterField.nextInt()) {
        case 1:
          System.out.println(introStatement);
          value = enterField.nextInt();
          converted = value / 48f;
          System.out.println(value + " teaspoons equals " + converted + " cups");
          break;
        case 2:
          System.out.println(introStatement);
          value = enterField.nextInt();
          converted = value * 1.6f;
          System.out.println(value + " miles equals " + converted + " kilometers.");
          break;
        case 3:
          System.out.println(introStatement);
          value = enterField.nextInt();
          converted = value * 5280f;
          System.out.println(value + " miles equals " + converted + " feet.");
          break;
        case 4:
          System.out.println(introStatement);
          value = enterField.nextInt();
          converted = value * .8326f;
          System.out.println(value + " in US Gallons equals " + converted + " in Imperial Gallons.");
          break;
        case 5:
          System.out.println("You have exited the Unit Converter");
          System.out.println("Thank you for using the Unit Converter");
          break;
        default:
          enterField.close();
          break;
      }
    }
  }
}
