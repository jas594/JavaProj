/* Name: Jason Sarnoff
 * TU ID: 914983482
 * Date: 2/18/14
 * Course: 1068 Sec 5
The purpose of this class is to help an employee calculate their net pay after
a week of working. This accounts for regular hours and overtime. Since the 
deciding factor of net pay is based on if overtime was incured, an if, else-if
loop was used. 
 */
package lab3;
import java.util.Scanner;
public class Paycheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double HourlySalary, WeeklyTime, RegularPay, OvertimePay, NetPay;
        int EmployeeNumber;

        System.out.println("Welcome to \"TEMPLE HUMAN RESOURCES\"");
        System.out.print("\n\tEnter Employee Number: ");
        EmployeeNumber = s.nextInt();
        System.out.print("\tEnter Hourly Salary: ");
        HourlySalary = s.nextDouble();
        System.out.print("\tEnter Weekly Time: ");
        WeeklyTime = s.nextDouble();

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