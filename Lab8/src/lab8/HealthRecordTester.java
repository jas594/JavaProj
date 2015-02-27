/* Name: Jason Sarnoff
 TU ID: 914983482
 Date: 3/23/14
 Course: 1068 Sec 5
 Lab #8
 The idea of lab 8 is to create a HealthRecord class which contains private instance variables
 that pass through a constructor to setter and getter methods. The 2nd class, the main, calls the methods
 to display the patients information and BMI, and lastly retrieves new HealthRecord information from a Scanner. 
 This new information is put into new variables and overwrites the previous data.
 */

package lab8;

import java.util.Scanner;

class HealthRecord {  //HealthRecord class that contains private instance variables and methods to set and get its values.
    
    private int ssn, age;
    private String firstName, lastName, email, phoneNumber;
    private double weight, height, BMI;

    HealthRecord (int social, int years, double pounds, double tall, String first, String last, String mail, String phone)
    {
        ssn = social;
        age = years;
        phoneNumber = phone;
        firstName = first;
        lastName = last;
        email = mail;
        weight = pounds;
        height = tall;   
    }
    
    void setBMI (double newBMI)
    {
        BMI = newBMI;
    }
    
    void setssn (int newssn) { //start of set methods
        ssn = newssn; //store the ssn
    }
    
    void setage (int newage) {
        age = newage;
    }
    
    void setphoneNumber (String newphoneNumber) {
        phoneNumber = newphoneNumber;
    }
    
    void setfirstName (String newfirstName) {
        firstName = newfirstName;
    }
    
    void setlastName (String newlastName) {
        lastName = newlastName;
    } 
    
    void setemail (String newemail) {
        email = newemail;
    }  
    
    void setweight (double newweight) {
        weight = newweight;
    }     
    void setheight (double newheight) {
        height = newheight;
    }       
     
    //-----------------------------------//
    
    int getssn() //start of get methods
    {
        return ssn; //retrives the ssn
    }
    
    int getage()
    {
        return age;
    }
    
    String getphoneNumber()
    {
        return phoneNumber;
    } 
    
    String getfirstName()
    {
        return firstName;
    }
    
    String getlastName()
    {
        return lastName;
    }
    
    String getemail()
    {
        return email;
        
    } 
    
    double getweight()
    {
        return weight;
    }
    
    double getheight()
    {
        return height;
    }
    
    double getBMI()
    {
        return BMI;
    }
    

    void calculateBMI(double weight, double height)
    {
        System.out.println("\n\t\tWeight = " + weight + " lbs, " + "Height = (" + height + "\") ");
        height = height * height;
        double BMI = (weight / height) * 703; 
        System.out.println("\t\tBMI = " + BMI);
    }
    
    void display() //calls the methods to get and print the data that the HealthRecord contains
    {
        System.out.println("Here is the patients health record: ");
        System.out.println("\n\tFull Name: " + getfirstName() + " " + getlastName() );
        System.out.println("\tSocial Security Number: " + getssn() );
        System.out.println("\tAge: " + getage() );
        System.out.println("\tTelephone Number: " + getphoneNumber() );
        System.out.println("\tE-mail Address: " + getemail() );
        System.out.println("\tWeight (lbs): " + getweight() );
        System.out.println("\tHeight (inches): " + getheight() );
    }
    
}

class HealthRecordTester {
    
    public static void main(String[] args) {

    
        HealthRecord patientOne = new HealthRecord(569341349, 20, 175.0, 66.0, "Jason" , "Sarnoff", "jsarnoff@temple.edu", "269-432-6789");
        
        patientOne.display();
        
        patientOne.calculateBMI(175.0, 66.0);
        
        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.print("\nSet a new value for ssn: ");
        int correctSSN = s.nextInt();
        patientOne.setssn(correctSSN);
        
        System.out.print("Set a new value for age: ");
        int correctAge = s.nextInt();
        patientOne.setage(correctAge);
        
        System.out.print("Set a new value for phone number: ");
        String correctPhoneNumber = s.next();
        patientOne.setphoneNumber(correctPhoneNumber);
        
        System.out.print("Set a new value for first name: ");
        String correctFirstName = s.next();
        patientOne.setfirstName(correctFirstName);
        
        System.out.print("Set a new value for last name: ");
        String correctLastName = s.next();
        patientOne.setlastName(correctLastName);
        
        System.out.print("Set a new value for email: ");
        String correctEmail = s.next();
        patientOne.setemail(correctEmail);
        
        System.out.print("Set a new value for weight: ");
        double correctWeight = s.nextDouble();
        patientOne.setweight(correctWeight);
        
        System.out.print("Set a new value for height: ");
        double correctHeight = s.nextDouble();
        patientOne.setheight(correctHeight);
        
        patientOne.display();

        patientOne.calculateBMI(correctWeight, correctHeight);
     
    }
    
}

