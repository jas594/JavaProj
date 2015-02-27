/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 2/18/14
 * Course: 1068 Sec 5
 The purpose of this class is to tell a customer how much of a discount they'll
 be receiving and what their total payment will be. A straight-forward if, else-
 if loop was used to determine the percentage off recevied based on the quantity
 purchased.
 */
package lab3;
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double ItemPrice, Cost, Discount, Total;
        int Quantity;

        System.out.println("Welcome to \"Temple\" store");
        System.out.print("\nEnter item price: $");
        ItemPrice = s.nextDouble();
        System.out.print("Enter quantity: ");
        Quantity = s.nextInt();
        Cost = Quantity * ItemPrice;
        System.out.println("\tThe item price is: $" + ItemPrice);
        System.out.println("\tThe order is: " + Quantity + " item(s)");
        System.out.println("\tThe cost is: $" + Cost);

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