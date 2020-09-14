import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
// Ask for the temperature
System.out.println("Please enter a temperature you would like to convert in degrees Celsius.:");
// declare and initialize a variable for temperature in Celsius
    int temp = input.nextInt();
    // declare and initialize a variable for fahrenheit
    int fahrenheit = (temp*9)/5+32;
    // State the temperature in fahrenheit
    System.out.println(temp + "C is the same as " + fahrenheit + "F");
  }
}
