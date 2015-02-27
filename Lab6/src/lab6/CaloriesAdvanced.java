/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 3/19/14
 * Course: 1068 Sec 5
 The purpose of this class was to implement the Harris-Benedict formula to calculate
 a user's BMR, or basal metabolic rate. After calculating their BMR based on a series
 of questions, their end result tells them how many candy bars they can eat a day
 to maintain their weight. To create this program, a series of print statements
 and scanner inputs were used as well as 2 switch statements. The switch statements
 played a vital role in deciding how to calculate the user's BMR and if the program
 should continue based on correct input. This class was further advanced in that
 it took into account possibilities that were not realistic and ended the program
 upon an invalid entry. 
 */
package lab6;

import java.util.Scanner;

public class CaloriesAdvanced {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        double height, weight, BMR = 0, extra, chocolateBar;
        String firstName, lastName, activityLevel, gender;

        System.out.println("This program will calculate the number of 230 calorie\n"
                + "candy bars to eat to maintain your weight.");
        System.out.print("\n\t[Q1] What is your first name? ");
        firstName = s.next().toUpperCase();
        System.out.print("\t[Q2] What is your last name? ");
        lastName = s.next().toUpperCase();
        System.out.print("\t[Q3] What is your age in years? ");
        age = s.nextInt();

        if (age <= 0 || age > 125) // prevents invalid age entry
        {
            System.out.println("\n\t" + firstName + " " + lastName + ", you have entered Invalid entry for age.");
            System.out.println("\nProgram ended.");
            System.exit(0);
        }

        System.out.print("\t[Q4] What is your total height in inches? ");
        height = s.nextDouble();

        if (height <= 0 || height > 108) // prevents invalid height entry
        {
            System.out.println("\n\t" + firstName + " " + lastName + ", you have entered Invalid entry for height.");
            System.out.println("\nProgram ended.");
            System.exit(0);
        }
        System.out.print("\t[Q5] What is your weight in pounds? ");
        weight = s.nextDouble();

        if (weight <= 0 || weight > 1400) // prevents invalid weight entry
        {
            System.out.println("\n\t" + firstName + " " + lastName + ", you have entered Invalid entry for weight.");
            System.out.println("\nProgram ended.");
            System.exit(0);
        }
        System.out.print("\t[Q6] Enter \"Male\" for male calculation or \"Female\" for female: ");
        gender = s.next().toLowerCase();

        switch (gender) {
            case "male":
                BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
                break;
            case "female":
                BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
                break;
            default:
                System.out.println("\n\t" + firstName + " " + lastName + ", you have entered Invalid entry for gender.");
                System.out.println("\nProgram ended.");
                System.exit(0);
        }

        System.out.println("\t[Q7] What is your Activity Level? ");
        System.out.println("\t\tA. Sedentary" + "\t(Little or no exercise)");
        System.out.println("\t\tB. Moderate" + "\t(exercise occasionally)");
        System.out.println("\t\tC. Vigorous" + "\t(exercise 3-4 days per week)");
        System.out.println("\t\tD. Extreme" + "\t(exercise every day)");
        System.out.print("\n\t\tEnter Sedentary, Moderate, Vigorous, or Extreme: ");
        activityLevel = s.next().toLowerCase();

        switch (activityLevel) {
            case "sedentary":
                extra = BMR * 0.20;
                BMR = extra + BMR;
                chocolateBar = BMR / 230;
                System.out.println("\n\t" + firstName + " " + lastName + ", with those measurements, you should eat " + chocolateBar + " candy bars \n\tper day to maintain the same weight.");
                break;
            case "moderate":
                extra = BMR * 0.30;
                BMR = extra + BMR;
                chocolateBar = BMR / 230;
                System.out.println("\n\t" + firstName + " " + lastName + ", with those measurements, you should eat " + chocolateBar + " candy bars \n\tper day to maintain the same weight.");
                break;
            case "vigorous":
                extra = BMR * 0.40;
                BMR = extra + BMR;
                chocolateBar = BMR / 230;
                System.out.println("\n\t" + firstName + " " + lastName + ", with those measurements, you should eat " + chocolateBar + " candy bars \n\tper day to maintain the same weight.");
                break;
            case "extreme":
                extra = BMR * 0.50;
                BMR = extra + BMR;
                chocolateBar = BMR / 230;
                System.out.println("\n\t" + firstName + " " + lastName + ", with those measurements, you should eat " + chocolateBar + " candy bars \n\tper day to maintain the same weight.");
            default:
                System.out.println("\n\t" + firstName + " " + lastName + ", you have entered Invalid entry for activity.");
                System.out.println("\nProgram ended.");
                System.exit(0);

        }
        System.out.println("\nProgram ended.");
    }
}
