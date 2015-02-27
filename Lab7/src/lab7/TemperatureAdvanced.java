/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 2/25/14
 * Course: 1068 Sec 5
 The purpose of this class is to provide the user with a simple Celcius to 
 Fahrenheit and visa versa converter. It uses your typical Scanner to input 
 the degree and if Celsius or Fahrenheit and goes into a switch/case loop to 
 produce the output. This class is now further advanced in that it runs through
 a do/while loop to continuously ask the user for conversions unless a q or Q is
 entered. 
 */
package lab7;

import java.util.Scanner;

public class TemperatureAdvanced {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double Temperature, Celsius, Fahrenheit;
        char CorF, qorQ;

        do {
            System.out.println("\nWelcome to Temple Weather Channel");
            System.out.println("Temperature Conversion Program");
            System.out.print("\n\tEnter a temperature in degrees (for example 29.6): ");
            Temperature = s.nextDouble();
            System.out.print("\tEnter 'F' (or 'f') for Fahrenheit or 'C' (or 'c') for Celsius: ");
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

            System.out.print("\nEnter 'Q' to quit or any other character to perform another temperature conversion: ");
            qorQ = s.next().charAt(0);

        } while (qorQ != 'q' && qorQ != 'Q');

        System.out.println("\nProgram ended.");

    }
}
