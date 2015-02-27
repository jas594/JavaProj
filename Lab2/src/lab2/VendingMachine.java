/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 2/11/14
 * Course: 1068 Sec 5
   The purpose of this lab was to accomplish multiple objectives,
   one of which is to create multiple classes. In this class, code is being 
   written for a vending machine. The main outcome of this code is to produce 
   what the customer's change will be, in exact format of nickles, dimes and 
   quarters.
 */

package lab2;
import java.util.*;
public class VendingMachine {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        int Item, Change, TotalQuarter, TotalDime, TotalNickel;
        int Quarter = 0;
        int Dime = 0;
        int Nickel = 0;
        
       
        System.out.print("Enter price of the item in 5-cent increments from 25 cents up to a dollar: ");
        Item = s.nextInt(); 
        
        Change = 100 - Item; // This amount is how much is owed back. Subtract what the user paid from
                             // a dollar and you're left with their change.
        
        TotalQuarter = Change % 25; // Finds remainder of change after taking out quarters 
        Quarter = (Change - TotalQuarter)/25; // This formula allows "Quarter" to store how many quarters are being returned
       
        TotalDime = TotalQuarter % 10; // Finds remainder after how many times 10 goes into the change left 
        Dime = (TotalQuarter - TotalDime)/10; // Allows "Dime" to store how many quarters are being returned
                
        TotalNickel = TotalDime % 5; // At this point, only 1 nickel is possible, if any
        Nickel = (TotalDime - TotalNickel) / 5; // Allows "Nickel" to store how many nickels are being returned 
        
        System.out.println("\nYou bought an item for " + Item + " cents and gave me a dollar, so your change is: " );
        System.out.println("\t" + Quarter + " " + "Quarter(s)");
        System.out.println("\t" + Dime + " " + "Dime(s)");
        System.out.println("\t" + Nickel + " " + "Nickel(s)");
       
        System.out.println("\nThank you for using \"Temple Vending Machine\"!");        
    }
    
}
