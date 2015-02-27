/* Name: Jason Sarnoff
 TU ID: 914983482
 Date: 3/31/14
 Course: 1068 Sec 5
 Lab #9
 The purpose of this lab is to ask the user what kind of flower and how many of each they would
 like to buy. A method was used to check if the user's input matched a flower that the store carries.
 If the store doesn't carry it, the program exits. If they do carry it, it asks the quantity they want
 and multiplies this number by the price. It finds the prices through an array and matches the indexes 
 through a series of 'if' 'else-if' statements. It finally prints out the user's flower type and the total
 cost based on the cost per flower. 
 */
package lab9;

import java.util.Scanner;

public class FlowerCounter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String flowerType;
        double priceFlower;
        int quantity;

        String[] names = {"petunia", "pansy", "rose", "violet", "carnation"};
        double[] prices = {0.50, 0.75, 1.50, 0.50, 0.80};

        System.out.println("What kind of flower would you like?");
        System.out.print("\"petunia\", \"pansy\", \"rose\", \"violet\", \"carnation\": ");
        flowerType = s.next().toLowerCase();

        if (isAvailable(names, flowerType) == 0) {
            System.out.println("\nSorry, we don't have that flower.");
            System.exit(0);
        }

        System.out.print("How many flowers would you like: ");
        quantity = s.nextInt();

        if (flowerType.equals(names[0])) {
            priceFlower = quantity * prices[0];
            System.out.println("\nPurchasing " + quantity + " of \"" + flowerType + "\" at " + prices[0] + " cents will cost $" + priceFlower);
        } else if (flowerType.equals(names[1])) {
            priceFlower = quantity * prices[1];
            System.out.println("\nPurchasing " + quantity + " of \"" + flowerType + "\" at " + prices[1] + " cents will cost $" + priceFlower);
        } else if (flowerType.equals(names[2])) {
            priceFlower = quantity * prices[2];
            System.out.println("\nPurchasing " + quantity + " of \"" + flowerType + "\" at " + prices[2] + " cents will cost $" + priceFlower);
        } else if (flowerType.equals(names[3])) {
            priceFlower = quantity * prices[3];
            System.out.println("\nPurchasing " + quantity + " of \"" + flowerType + "\" at " + prices[3] + " cents will cost $" + priceFlower);
        } else if (flowerType.equals(names[4])) {
            priceFlower = quantity * prices[4];
            System.out.println("\nPurchasing " + quantity + " of \"" + flowerType + "\" at " + prices[4] + " cents will cost $" + priceFlower);
        }

    }

    public static int isAvailable(String names[], String flower) {
        for (int i = 0; i < names.length; i++) {
            if (flower.equals(names[i])) {
                return 1;
            }

        }
        return 0;

    }

}
