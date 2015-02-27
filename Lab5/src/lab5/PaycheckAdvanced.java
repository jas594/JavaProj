/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 3/11/14
 * Course: 1068 Sec 5
This class simply adds a new 'filter' for the data entered for employee number,
hourly salary, or weekly time. If a negative number or 0 is entered, the program
exits and prints an error message corresponding to the invalid entry. 
 */
package lab5;
import java.util.Scanner;
public class PaycheckAdvanced {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double HourlySalary, WeeklyTime, RegularPay, OvertimePay, NetPay, EmployeeNumber;
       
        System.out.println("Welcome to \"TEMPLE HUMAN RESOURCES\"");
        
        System.out.print("\n\tEnter Employee Number: ");
        EmployeeNumber = s.nextDouble();
        if (EmployeeNumber<=0 || EmployeeNumber%1!=0) { // New 'if' statement restriction
            System.out.println("\tThis is not a valid employee number.\n\tPlease run the program again");
            System.out.println("\nThank you for using \"TEMPLE HUMAN RESOURCES\"");
            System.exit(0);  
        }
        
        System.out.print("\tEnter Hourly Salary: ");
        HourlySalary = s.nextDouble();
        
         if (HourlySalary<=0) { // New 'if' statement restriction
            System.out.println("\tThis is not a valid hourly salary amount.\n\tPlease run the program again");
            System.out.println("\nThank you for using \"TEMPLE HUMAN RESOURCES\"");
            System.exit(0);
        }
        
        System.out.print("\tEnter Weekly Time: ");
        WeeklyTime = s.nextDouble();
        
         if (WeeklyTime<=0) { // New 'if' statement restriction
            System.out.println("\tThis is not a weekly time.\n\tPlease run the program again");
            System.out.println("\nThank you for using \"TEMPLE HUMAN RESOURCES\"");
            System.exit(0);
        }

        System.out.println("\t========================================");
        
        System.out.println("\tEmployee #: " + EmployeeNumber);
        System.out.println("\tHourly Salary: $" + HourlySalary);  
        System.out.println("\tWeekly Time: " + WeeklyTime);
       
        
        if (WeeklyTime <= 40) {
            RegularPay = HourlySalary * WeeklyTime;
            OvertimePay = 0;
            NetPay = RegularPay;
            System.out.println("\tRegular Pay: $" + RegularPay + "$");
            System.out.println("\tNet Pay: $" + NetPay + "$");
        } else if (WeeklyTime > 40) {
            RegularPay = 40 * HourlySalary;
            OvertimePay = (WeeklyTime - 40) * (1.5 * HourlySalary);
            NetPay = RegularPay + OvertimePay;
            System.out.println("\tRegular Pay: $" + RegularPay);
            System.out.println("\tOvertime Pay: $" + OvertimePay);
            System.out.println("\tNet Pay: $" + NetPay);
        }

        System.out.println("\t========================================");
        System.out.println("Thank you for using \"TEMPLE HUMAN RESOURCES\"");  
    }
}
