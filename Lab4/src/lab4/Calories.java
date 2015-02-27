/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 2/25/14
 * Course: 1068 Sec 5
The purpose of this class was to implement the Harris-Benedict formula to calculate
a user's BMR, or basal metabolic rate. After calculating their BMR based on a series
of questions, their end result tells them how many candy bars they can eat a day
to maintain their weight. To create this program, a series of print statements
and scanner inputs were used as well as 2 switch statements. The switch statements
played a vital role in deciding how to calculate the user's BMR and if the program
should continue based on correct input. 
 */
package lab4;
import java.util.Scanner;
public class Calories {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age;
        double height, weight, BMR=0, extra, chocolateBar;
        char gender, activityLevel;

        System.out.println("This program will calculate the number of 230 calorie\n"
                + "candy bars to eat to maintain your weight.");
        System.out.print("\n\t[Q1] What is your age in years? ");
        age = s.nextInt();
        System.out.print("\t[Q2] What is your total height in inches? ");
        height = s.nextDouble();
        System.out.print("\t[Q3] What is your weight in pounds? ");
        weight = s.nextDouble();
        System.out.print("\t[Q4] Enter 'M' (or 'm') for male calculation or 'F' (or 'f') for female: ");
        gender = s.next().charAt(0);
        System.out.println("\t[Q5] Are you: ");
        System.out.println("\t" + "\t" + "A. Sedentary");
        System.out.println("\t" + "\t" + "B. Somewhat active (exercise occasionally)");
        System.out.println("\t" + "\t" + "C. Active (exercise 3-4 days per week)");
        System.out.println("\t" + "\t" + "D. Highly active (exercise every day)");
        System.out.print("\t[Q6] Enter A, B, C, or D:  ");
        activityLevel = s.next().charAt(0);

        switch (gender) {
            case 'M':
            case 'm':
                BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
                break;
            case 'F':
            case 'f':
                BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
                break;
            default:             
                System.out.println("\nInvalid entry for gender.");
                System.out.println("Program ended.");
                System.exit(0);
        }
        
        switch (activityLevel) {
            case 'A':
                extra = BMR * 0.20;
                BMR = extra + BMR;
                chocolateBar = BMR / 230;
                System.out.println("\n\tWith those measurements, you should eat " + chocolateBar + " candy bars per day\n\tto maintain the same weight.");
                break;
            case 'B':
                extra = BMR * 0.30;
                BMR = extra + BMR;
                chocolateBar = BMR / 230;
                System.out.println("\n\tWith those measurements, you should eat " + chocolateBar + " candy bars per day\n\tto maintain the same weight.");
                break;
            case 'C':
                extra = BMR * 0.40;
                BMR = extra + BMR;
                chocolateBar = BMR / 230;
                System.out.println("\n\tWith those measurements, you should eat " + chocolateBar + " candy bars per day\n\tto maintain the same weight.");
                break;
            case 'D':
                extra = BMR * 0.50;
                BMR = extra + BMR;
                chocolateBar = BMR / 230;
                System.out.println("\n\tWith those measurements, you should eat " + chocolateBar + " candy bars per day\n\tto maintain the same weight.");     
        }
        System.out.println("\nProgram ended.");
    }
}