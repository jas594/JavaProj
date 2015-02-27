/*
The purpose of this lab is to provide a calculator that calculates and compounds 
interest over a given amount of years. This puts the data entered into a formatted
table that shows interest for each year compounded yearly, monthly, and daily. 3
for loops were needed with 2 of the loops being nested into the yearly loop. 
 */
package lab7;

import java.util.Scanner;
import java.util.Formatter;

public class BankAccount {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int i, years = 0;
        double interestRate = 0, yearly = 0, daily = 0, balance = 0, principle = 0, monthly = 0;
        char quit;

        do {

            System.out.print("\nPlease enter the starting balance: ");
            yearly = s.nextInt();
            monthly = yearly;
            daily = yearly;
            System.out.print("Please enter the yearly interest rate in percent: ");
            interestRate = s.nextDouble();
            System.out.print("Please enter number of years: ");
            years = s.nextInt();

            System.out.println("\tUsing data:");
            System.out.println("\tPrinciple:  " + yearly);
            System.out.println("\tInterest Rate:   " + interestRate);
            interestRate = interestRate/100; //puts interest over 100 to make it a decimal
            System.out.println("\tYears:           " + years);

            System.out.println("|Year  |Yearly  |Monthly |Daily   |");
            for (i = 1; i <= years; i++) {
                yearly = yearly + (interestRate * yearly); //formula to compound yearly interest

                for (int j = 1; j <= 12; j++) {
                    monthly = monthly + (interestRate / 12) * monthly; //formula to compound interest monthly

                }
                for (int d = 1; d <= 365; d++) {
                    daily = daily + (interestRate / 365) * daily; //formula to compound interest daily
                }

                System.out.format("|%6d|$%.2f|$%.2f|$%.2f|\n", i, yearly, monthly, daily);
            }

            System.out.print("\nDo you want to do it again?" + "\nEnter y for yes"
                    + " or n for no: ");
            quit = s.next().charAt(0);

        } while (quit != 'n' && quit != 'N');
        System.out.println("Program Ended");

    }
}
