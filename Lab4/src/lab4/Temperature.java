/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 2/25/14
 * Course: 1068 Sec 5
The purpose of this class is to provide the user with a simple Celcius to 
Fahrenheit and visa versa converter. It uses your typical Scanner to input 
the degree and if Celsius or Fahrenheit and goes into a switch/case loop to 
produce the output. 
 */
package lab4;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Temperature, Celsius, Fahrenheit;
        char CorF;

        System.out.println("Welcome to Temple Weather Channel");
        System.out.println("Temperature Conversion Program");
        System.out.print("\n\t[Q1] Enter a temperature in degrees (for ex. 29.6): ");
        Temperature = s.nextDouble();
        System.out.print("\t[Q2] Enter 'F' (or 'f') for Fahrenheit or 'C' (or 'c') for Celsius: ");
        CorF = s.next().charAt(0);

        switch (CorF) {
            case 'F':
            case 'f':
                Celsius = 5 * (Temperature - 32) / 9;
                System.out.println("\n\t" + Temperature + " degrees Fahrenheit = " + Celsius + " degrees Celsius.");
                break;
            case 'C':
            case 'c':
                Fahrenheit = (9 * (Temperature) / 5) + 32;
                System.out.println("\n\t" + Temperature + " degrees C = " + Fahrenheit + " degrees Fahrenheit.");
                break;
            default:
                System.out.println("\n\t Unknown units - ");
                System.out.println("\t Cannot do calculation - ");
                System.out.println("\t Please next time enter either 'F' for Fahrenheit or 'C' for Celsius.");
        }
        System.out.println("\nProgram ended.");
    }
}