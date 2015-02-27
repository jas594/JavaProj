/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 3/11/14
 * Course: 1068 Sec 5
This class simply adds a new 'filter' for the data entered for item price and 
quantity. If a negative number or 0 is entered, the program exits and prints an
error message corresponding to the invalid entry. 
 */
package lab5;
import java.util.Scanner;
public class RevenueAdvanced {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ItemPrice, Cost=0, Discount, Total;
        int Quantity;
        
        System.out.println("Welcome to \"Temple\" store");
        System.out.print("\nEnter item price: $");
        ItemPrice = s.nextDouble();
        
        if (ItemPrice <= 0) { // New 'if' statement restriction
            System.out.println("\tThis is not a valid item price.\n\tPlease run the program again");
            System.out.println("\nThank You for using \"Temple\" store");
            System.exit(0);
        }
        
        System.out.print("Enter quantity: ");
        Quantity = s.nextInt();
        if (Quantity <= 0) { // New 'if' statement restriction
            System.out.println("\tThis is not a valid quantity order.\n\tPlease run the program again");
            System.out.println("\nThank You for using \"Temple\" store");
            System.exit(0);
        }
        else {
            Cost = Quantity * ItemPrice;
            System.out.println("\tThe item price is: $" + ItemPrice);
            System.out.println("\tThe order is: " + Quantity + " item(s)");
            System.out.println("\tThe cost is: $" + Cost);
        }
        
        if ((Quantity >= 50) && (Quantity <= 99)) {
            System.out.println("\tThe discount is: 10.0%");
            Discount = Cost * 0.10;
            Total = Cost - Discount;
            System.out.println("\tThe discount amount is: $" + Discount);
            System.out.println("\tThe total is: $" + Total);

        } else if ((Quantity >= 100) && (Quantity <= 149)) {
            System.out.println("\tThe discount is: 15.0%");
            Discount = Cost * 0.15;
            Total = Cost - Discount;
            System.out.println("\tThe discount amount is: $" + Discount);
            System.out.println("\tThe total is: $" + Total);

        } else if ((Quantity >= 1) && (Quantity <= 49)) {
            System.out.println("\tThe discount is: 0%");
            Total = Cost;
            System.out.println("\tThe discount amount is: 0$");
            System.out.println("\tThe total is: $" + Total);

        } else if (Quantity >= 150) {
            System.out.println("\tThe discount is: 25.0%");
            Discount = Cost * 0.25;
            Total = Cost - Discount;
            System.out.println("\tThe discount amount is: $" + Discount);
            System.out.println("\tThe total is: $" + Total);
        }
        System.out.println("\nThank you for using \"Temple\" store ");
    }
}