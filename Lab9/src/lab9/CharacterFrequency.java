/* Name: Jason Sarnoff
 TU ID: 914983482
 Date: 3/31/14
 Course: 1068 Sec 5
 Lab #9
 The purpose of this lab is to have the user enter a String with up to 10 characters.
 If the String is more than 10 characters, it will exit. If it is <=10, it will run through
 a 'for' loop and 'if' statement which will scan each character in the String, store it as an integer,
 and add 1 to the counter array each time a number 0-9 is found. It will finally print out the results
 of how many times each number was found. Converting each character to an int through 'getNumericalValue'
 was a crucial part to this program.
 */
package lab9;

import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word;
        int[] counter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int print = 0, tempInt;

        System.out.print("Give me a word of 10 characters.\nI will tell you if it contains any"
                + " numbers, and how many: ");
        word = s.next();

        if (word.length() > 10) {
            System.out.println("Wrong length, you have entered an invalid word.");
            System.exit(0);
        }

        for (int i = 0; i < word.length(); i++) {
            tempInt = Character.getNumericValue(word.charAt(i)); //converts each character to an int and stores it in tempInt

            if (tempInt >= 0 && tempInt <= 9) {
                counter[tempInt]++; // adds 1 to the index of this number
            }

        }

        System.out.println("The count for each digit is: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("\tCount of " + print + " is " + counter[i]);
            print++;
        }

    }
}
