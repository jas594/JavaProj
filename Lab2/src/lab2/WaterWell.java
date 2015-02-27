/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 2/11/14
 * Course: 1068 Sec 5
   The purpose of this lab is to help the user figure out how much water will be available
   in their well according to the height and radius of their well. The formula used was 
   the volume of a cylinder which is V=Pi*r^2*h. 
 */
package lab2;
import java.util.Scanner;
public class WaterWell {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        double Radius, Height, Gallons;
        double Pi = 3.1415;
        
        System.out.println("This program calculates how much water will be available in a well.");
        System.out.print("\nWhat is the radius of the casing in inches?  ");
        Radius = s.nextDouble(); // reads the radius from user
        Radius = Radius / 12; // puts the radius over 12 inches because 12in = 1ft
        Radius = Radius * Radius; // Squares the radius
        System.out.print("What is the depth of the well in feet?  ");
        Height = s.nextDouble();
        Gallons = (Pi*Radius*Height) * 7.48; // follows the formula for volume of a cylinder and 
                                             // and multiplies by 7.48, the amount of gallons in 1 cubic foot.
        
        System.out.println("The well contains " + Gallons + " gallons.");
        
        
        System.out.println("\nProgram successfully ended");
        System.out.println("Please run the program again to do another calculation");  
        
    }
    
}

