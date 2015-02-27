/*
Asks a series of questions which are implemented into 2 methods
 */

package practice04;

import java.util.Scanner;

  class Person {
          
        public String firstName, lastName, email, telephone;     
       
        public void readInput() {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter first name: ");
            firstName = s.nextLine();
            
            System.out.print("Enter last name: ");
            lastName = s.nextLine();
            
            System.out.print("Enter e-mail: ");
            email = s.next();
            
            System.out.print("Enter Telephone number ex. (555)-666-7777: "); 
            telephone = s.next();
            
            System.out.println("--------------------------------");

        }
        
        public void writeOutput() {
            System.out.println("\tFirst Name: " + firstName);
            System.out.println("\tLast Name: " + lastName);
            System.out.println("\tE-mail: " + email);
            System.out.println("\tTelephone number: " + telephone);
            System.out.println();
        }
                          
        
}

